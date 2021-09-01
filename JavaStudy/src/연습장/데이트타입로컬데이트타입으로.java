package 연습장;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

import jdbc.model.Employee;

public class 데이트타입로컬데이트타입으로 {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee(null);
			
		//Date to Instant
		Instant instant = Instant.ofEpochMilli(employee.getHire_date().getTime());
		
		//Instant to LocalDateTime
		LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
	}
}
