package in.vj.beans;

public class Student 
{
	 private String name;
	 private float marks;
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setMarks(float marks) {
		 this.marks = marks;
	 }
	 
	 public void disp()
	 {
		 System.out.println("Hello "+ name + ", you got total "+ marks);
	 }
	 
}
