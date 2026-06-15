package in.vj.main;

import in.vj.beans.Address;
import in.vj.beans.Student;

public class Main {

	public static void main(String[] args)
	{
		Address add = new Address();
		add.setHouseno(255);
		add.setCity("Indore");
		add.setPincode(452018);
		
		Student std = new Student();
		std.setName("Vishal");
		std.setRoll(45);
		std.setAddress(add);

		std.disp();
	}

}


// Output:-

/*

Name: Vishal
Rollno: 45
Address: #255-Indore-452018

*/