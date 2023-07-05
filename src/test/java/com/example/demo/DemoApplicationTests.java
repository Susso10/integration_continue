package com.example.demo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import static org.assertj.core.api.Assertions.assertThat;
import com.example.demo.entity.UserEntity;
import com.example.demo.repository.UserRepository;

@SpringBootTest
class DemoApplicationTests {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Test
	void contextLoads() {
	}
	
	@Test

	public void whenFindByEmail_thenReturnUser() {


	UserEntity user = new UserEntity();

	user.setEmail("jujutin10@gmail.com");

	//user.setNomComplet("Justin CORREIA");

	user.setAccountVerified(true);

	user.setPassword(passwordEncoder.encode("Passe"));

	//user.setRoles("ADMIN");

	userRepository.save(user);



	UserEntity found = userRepository.findByEmail(user.getEmail());

	assertThat(found.getEmail()).isEqualTo("jujutin10@gmail.com");

	}

}
