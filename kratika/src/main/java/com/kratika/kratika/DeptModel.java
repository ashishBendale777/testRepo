package com.kratika.kratika;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept_info")
public class DeptModel {
	
@Id
@Column(name="dept_id")
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int dept_id;

@Column(name="dept_name")
private String dept_name;

@Column(name="dept_hod")
private String dept_hod;

@Column(name="building_no")
private int building_no;

@OneToMany(mappedBy="dept")
private Set<StudentModel> student;


public int getDept_id() {
	return dept_id;
}

public void setDept_id(int dept_id) {
	this.dept_id = dept_id;
}

public String getDept_name() {
	return dept_name;
}

public void setDept_name(String dept_name) {
	this.dept_name = dept_name;
}

public String getDept_hod() {
	return dept_hod;
}

public void setDept_hod(String dept_hod) {
	this.dept_hod = dept_hod;
}

public int getBuilding_no() {
	return building_no;
}

public void setBuilding_no(int building_no) {
	this.building_no = building_no;
}

}
