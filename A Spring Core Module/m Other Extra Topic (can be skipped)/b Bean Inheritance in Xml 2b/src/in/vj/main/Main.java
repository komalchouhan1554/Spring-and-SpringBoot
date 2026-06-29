package in.vj.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.vj.beans.Employee;
import in.vj.beans.Student;
public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/in/vj/resources/applicationContext.xml");
		
		Student std = (Student) context.getBean("stdId");
		std.stdDisp();
		
		System.out.println("---------------------------");
		Employee emp = (Employee)context.getBean("empId");
		emp.empDisp();

	}
}

// Output:-

/*

Name : Vishal
Aadhar: 7412369854
Phone: 4513287845
---------------------------
EmpId: 75
Name : Vishal
Aadhar: 7412369854
Phone: 7564125756

*/