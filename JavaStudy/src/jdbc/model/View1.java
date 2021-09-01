package jdbc.model;

import java.util.ArrayList;

import javax.swing.text.View;

public class View1 {
	String first_name;
	int department_id;
	String department_name;
	String city;
	
	public View1(String first_name,int department_id,String department_name, String city) {
		// TODO Auto-generated constructor stub
		this.first_name = first_name;
		this.department_id = department_id;
		this.department_name = department_name;
		this.city = city;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public String getDepartment_name() {
		return department_name;
	}
	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("%-10s%-15d%-15s%-10s\n", first_name,department_id,department_name,city);
	}
}
