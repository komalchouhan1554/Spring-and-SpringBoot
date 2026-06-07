package in.vj.factory;

import in.vj.beans.Student;

public class StudentFactory 
{
	public Student createObj() {
		System.out.println("Factory method: createObj method........");
		
		return new Student(10);
	}
}
