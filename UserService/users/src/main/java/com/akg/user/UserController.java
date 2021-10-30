package com.akg.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/saveUser")
	public String saveUsers(@RequestBody User user) {
	service.saveUser(user);
	
	log.info("User " + user.getFirstName() + " "+user.getLastName() + " Successfully Added !!");
	return "User " + user.getFirstName() + " "+user.getLastName() + " Successfully Added !!";
	
	}
	
	@GetMapping("/getUsers")
	public List<User> getAllUsers(){
		log.info("Getting all the users");
		return service.getUsers();	
	}

	@GetMapping("/getUser/{userName}")
	public User getUserbyUserName(@PathVariable("userName") String userName){
		log.info("Getting the information of the user "+userName);
		return service.getUserByUserName(userName);	
	}
	
	@GetMapping("/getUserDetails/{userName}")
	public UserDetailVO getUserDetails(@PathVariable("userName") String userName){
		log.info("Getting the User as well as the Address Information");
		return service.getUserDetails(userName);	
	}

}
