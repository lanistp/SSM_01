package cn.it.bean;

import java.util.Date;

public class Teacher {
	
	private Integer id;
	private String name;
	private String classMate;
	private String address;
	private Date birthDay;
	
	
	public Teacher() {
		super();
	}
	public Teacher(Integer id, String name, String classMate, String address, Date birthDay) {
		super();
		this.id = id;
		this.name = name;
		this.classMate = classMate;
		this.address = address;
		this.birthDay = birthDay;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassMate() {
		return classMate;
	}
	public void setClassMate(String classMate) {
		this.classMate = classMate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", classMate=" + classMate + ", address=" + address
				+ ", birthDay=" + birthDay + "]";
	}

}
