package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class EmployeDAOImpl {
	
	private List<Employe> employes; // Source de données simulée (une liste en mémoire)

    public EmployeDAOImpl() {
        employes = new ArrayList<>();
    }

    public List<Employe> getAllEmployes() {
        return employes;
    }

    public Employe getEmployeById(int id) {
        for (Employe employe : employes) {
            if (employe.getEmployeID() == id) {
                return employe;
            }
        }
        return null; // Retourne null si l'employé n'est pas trouvé
    }

    public void createEmploye(Employe employe) {
        employes.add(employe);
    }

    public void updateEmploye(Employe employe) {
        int index = employes.indexOf(employe);
        if (index != -1) {
            employes.set(index, employe);
        }
    }

    public void deleteEmploye(Employe employe) {
        employes.remove(employe);
    }

    // Insérer un nouvel employé
    public void insert(Employe employe) {
        int newId = generateNewId();
        employe.setEmployeID(newId);
        createEmploye(employe);
    }

    // Générer un nouvel ID pour un employé
    private int generateNewId() {
        int maxId = 0;
        for (Employe employe : employes) {
            if (employe.getEmployeID() > maxId) {
                maxId = employe.getEmployeID();
            }
        }
        return maxId + 1;
    }

}
