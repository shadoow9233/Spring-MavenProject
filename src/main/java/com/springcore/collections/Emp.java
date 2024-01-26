package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
private String name;
private List<String> Phones;
private Set<String> address;
private Map<String,String> Courses;
private Properties self;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<String> getPhones() {
	return Phones;
}
public void setPhones(List<String> phones) {
	Phones = phones;
}
public Set<String> getAddress() {
	return address;
}
public void setAddress(Set<String> address) {
	this.address = address;
}
public Map<String, String> getCourses() {
	return Courses;
}
public void setCourses(Map<String, String> courses) {
	Courses = courses;
}
public Properties getSelf() {
	return self;
}
public void setSelf(Properties self) {
	this.self = self;
}
public Emp(String name, List<String> phones, Set<String> address, Map<String, String> courses, Properties self) {
	super();
	this.name = name;
	Phones = phones;
	this.address = address;
	Courses = courses;
	this.self = self;
}
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Emp [name=" + name + ", Phones=" + Phones + ", address=" + address + ", Courses=" + Courses + ", self="
			+ self + "]";
}


}
