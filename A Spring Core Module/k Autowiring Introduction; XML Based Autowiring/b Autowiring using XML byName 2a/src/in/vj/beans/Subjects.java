package in.vj.beans;

import java.util.ArrayList;
import java.util.List;

public class Subjects 
{
	List< String> subjects = new ArrayList<String>();

	public List<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return subjects.toString();
	}
	
}
