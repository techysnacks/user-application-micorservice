package com.akg.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name="USERS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {

	@Id
	@GeneratedValue(generator = "personid_seq")
	public int id;
	public String userName;
	public String firstName;
	public String lastName;
	public String userType;
	public String phone;
	public String email;
	
	
	
	
}
