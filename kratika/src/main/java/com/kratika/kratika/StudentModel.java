package com.kratika.kratika;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="student_information")
public class StudentModel {
	@Id
	@Column(name="sid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sid;
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="mname")
	private String mname;
	
	@Column(name="lname")
	private String lname;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="city")
	private String city;
	
	@Column(name="marks")
	private int marks;
	
	@Column(name="mobile_no")
	private String mobile_no;
	
	@Column(name="adhar_no")
	private String adhar_no;
	
	/*@Column(name="dept_id")
	private int dept_id;*/
	
	@ManyToOne
	@JoinColumn(name="dept_id",nullable=true)
	private DeptModel dept;
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public String getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(String mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getAdhar_no() {
		return adhar_no;
	}

	public void setAdhar_no(String adhar_no) {
		this.adhar_no = adhar_no;
	}

	/*public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}*/

	
	
	

}
