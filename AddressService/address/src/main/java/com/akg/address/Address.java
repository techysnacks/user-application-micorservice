package com.akg.address;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address {

	@Id
	@GeneratedValue(generator = "personid_seq")
	public int id;
	public String userName;
	public String line1;
	public String line2;
	public String city;
	public String state;
	public String zip;
		
}
