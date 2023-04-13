package com.jpa.test;

import java.util.Iterator;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository =context.getBean(UserRepository.class);
//		User user = new User();
//		user.setName("Durgesh Tiwari");
//		user.setCity("Delhi");
//		user.setStatus("I am a java programmer");
//		
//		User user1 = userRepository.save(user);
//		System.out.println(user1);
//		Optional<User> optional = userRepository.findById(52);	
//		User user = optional.get();
//		user.setName("Ankit Tiwari");
//		User result = userRepository.save(user);
//		System.out.println(result);
//		Iterable<User> iterable =  userRepository.findAll();
//		Iterator<User> iterator = iterable.iterator();
//		while(iterator.hasNext()) {
//			User user = iterator.next();
//			System.out.println(user); 
//		}
//		iterable.forEach(User->System.out.println(User));
//		userRepository.deleteById(53);
//		System.out.println("deleted");
//		Iterable<User> iterable = userRepository.findAll();
//		iterable.forEach(user->System.out.println(user));
//	    userRepository.deleteAll(iterable);
		Iterable<User> allUser = userRepository.getAllUser();
		allUser.forEach(e->{
			System.out.println(e);
		});
		
		userRepository.getUserByName("shivam","mzn").forEach(e->{
			System.out.println(e);
		});
		userRepository.getUsers().forEach(e->System.out.println(e));
	}

}
