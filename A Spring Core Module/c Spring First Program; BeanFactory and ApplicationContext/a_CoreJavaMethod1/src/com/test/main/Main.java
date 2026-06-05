package com.test.main;

import com.test.beans.Student;


// All the objects are created her manually by user.
public class Main {

	public static void main(String[] args) 
	{

		Student st = new Student();
		
		st.setName("Vishal");
		st.setRollNo(101);
		
		st.disp();

	}

}


// Output:-

/*

name is : Vishal
ROll no : 101

*/