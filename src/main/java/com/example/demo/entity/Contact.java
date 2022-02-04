package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "contacts")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	//House Number
	@NotNull
	@Size(max = 10)
	@Pattern(regexp = "[0-9 ]+")
	private String houseNum;
	
	//Street
	@NotBlank
	@NotNull
	@Size(max = 50)
	private String street;
	
	//City
	@NotBlank
	@NotNull
	@Size(max = 25)
	@Pattern(regexp ="^[a-zA-Z\\s]+$")
	private String city;
	
	//PIN
	@NotBlank
	@NotNull
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 7)
	private String pin;
	
	//First Name
	@NotNull
	@Size(max = 10)
	@Pattern(regexp ="^[a-zA-Z\\s]+$")
	private String firstname;
	
	//Last Name
	@NotNull
	@Size(max = 10)
	@Pattern(regexp ="^[a-zA-Z\\s]+$")
	private String lastname;
	
	//Age
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	private String age;
	
	//Mobile
	@NotNull
	@NotBlank
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 12)
	private String mobile;
	
	//Telephone
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 12)
	private String telephone;
	
	//Fax
	@Pattern(regexp = "[0-9 ]+")
	@Size(max = 12)
	private String fax;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}
		

}
