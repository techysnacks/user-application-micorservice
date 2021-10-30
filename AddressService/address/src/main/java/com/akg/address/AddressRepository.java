package com.akg.address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer>{

	public Address findByUserName(String userName);

}


