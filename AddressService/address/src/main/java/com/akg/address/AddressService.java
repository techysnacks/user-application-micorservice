package com.akg.address;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

	@Autowired
	private AddressRepository repo;

	public Address saveUser(Address address) {
		return repo.save(address);
	}

	public Address getAddressByUserName(String userName) {
		return repo.findByUserName(userName);
	}

}
