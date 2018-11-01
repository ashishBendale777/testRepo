package com.kratika.kratika;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_data")
public class Student {
	
	@Id
	@Column(name="sno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name="name")
	private String name;
	
	@Column(name="sname")
	private String sname;
	
	@Column(name="address")
	private String address;
	
	@Column(name="city")
	private String city;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="qualification")
	private String qualification;

	@Column(name="DOB")
	private String DOB;
	
	@Column(name="mobile_no")
	private String mobile_no;

	   
	    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

		public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getSname() {
	        return sname;
	    }

	    public void setSname(String sname) {
	        this.sname = sname;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getQualification() {
	        return qualification;
	    }

	    public void setQualification(String qualification) {
	        this.qualification = qualification;
	    }

	    public String getDOB() {
	        return DOB;
	    }


	    public void setDOB(String DOB) {
	        this.DOB = DOB;
	    }
	    
	    public String getMobile_no() {
	        return mobile_no;
	    }

	    public void setMobile_no(String mobile_no) {
	        this.mobile_no = mobile_no;
	    }
	   
	    
	     
}

