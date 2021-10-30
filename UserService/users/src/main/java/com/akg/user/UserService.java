package com.akg.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		return repo.save(user);
	}

	public List<User> getUsers() {
		return repo.findAll();
	}

	public User getUserByUserName(String userName) {
		return repo.findByUserName(userName);
	}
	
	public UserDetailVO getUserDetails(String userName) {
		UserDetailVO vo = new UserDetailVO();
		User user = getUserByUserName(userName);
		Address address = restTemplate.getForObject("http://ADDRESS-SERVICE/address/getAddress/"+userName, Address.class);
		vo.setUser(user);
		vo.setAddress(address);
		return vo;
		
	}
	

}
