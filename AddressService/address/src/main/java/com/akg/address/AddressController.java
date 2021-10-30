package com.akg.address;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AddressService service;
	
	Logger log = LoggerFactory.getLogger(AddressController.class);
	
	@PostMapping("/saveAddress")
	public String saveAddress(@RequestBody Address address) {
	service.saveUser(address);
	log.info("Address Information Saved {}",address);
		
	return "Address Saved";
	}
	
	@GetMapping("/getAddress/{userName}")
	public Address getAddressByUserName(@PathVariable("userName") String userName){
		log.info("Getting Address Information for {}", userName);
		return service.getAddressByUserName(userName);	
	}
}
