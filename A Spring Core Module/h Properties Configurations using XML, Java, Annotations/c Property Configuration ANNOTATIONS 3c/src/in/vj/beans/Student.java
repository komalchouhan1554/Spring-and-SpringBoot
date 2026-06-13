package in.vj.beans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student 
{
	@Value("Prafull")
	private String name;
	
	@Value("51")
	private int roll;
	
	
	//@Value("#{{'C':87, 'CPP':78, 'Python':97, 'Java' :98}}")
	@Value("#{${subMark : {'C':87, 'CPP':78, 'Python':97, 'Java' :98}}}")
	private Map<String, Integer> subMarks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	
	
	public Map<String, Integer> getSubMarks() {
		return subMarks;
	}
	public void setSubMarks(Map<String, Integer> subMarks) {
		this.subMarks = subMarks;
	}
	public void disp() {
		System.out.println("Name: "+ name);
		System.out.println("Roll NO: "+ roll);
		System.out.println("Subjects & Mrsks: "+ subMarks);
	}
}
