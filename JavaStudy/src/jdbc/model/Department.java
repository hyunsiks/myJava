package jdbc.model;

public class Department {

	private int department_id;
	private String department_name;
	private Employee manager;
	int manager_id;
	private Location location;
	int location_id;
}

class Location{
	int location_id;
}