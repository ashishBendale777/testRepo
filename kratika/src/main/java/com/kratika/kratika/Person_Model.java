package com.kratika.kratika;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_data")
public class Person_Model {
	@Id
	@Column(name="sno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String fname;
	
	@Column
	private String lname;
	
	@Column
	private String address;
	
	@Column
	private String adhar_no;
	
	@Column
	private String mobile_no;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAdhar_no() {
		return adhar_no;
	}

	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	
	
	
	

}
