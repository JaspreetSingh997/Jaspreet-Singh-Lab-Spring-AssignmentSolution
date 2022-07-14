package com.greatlearning.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.greatlearning.studentmanagementsystem.dao.RoleRepository;
import com.greatlearning.studentmanagementsystem.dao.UserRepository;
import com.greatlearning.studentmanagementsystem.entity.Role;
import com.greatlearning.studentmanagementsystem.entity.User;

@SpringBootApplication
public class StudentmanagementsystemApplication implements CommandLineRunner  {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired RoleRepository roleRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementsystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		//	System.out.println("Welcome to Student Manager!");
		//	PasswordEncoder encoder = new BCryptPasswordEncoder();
		//	Role role1 = new Role();
		//	role1.setName("GUEST");
		//	User user1 = new User();
		//	user1.setUsername("Jass");
		//	user1.setPassword(encoder.encode("Jass"));
		//	List<Role> user1_roles = new ArrayList<Role>();
		//	user1_roles.add(role1);
		//	user1.setRoles(user1_roles);
		//	userRepository.save(user1);
		//	roleRepository.save(role1);

	}

}
