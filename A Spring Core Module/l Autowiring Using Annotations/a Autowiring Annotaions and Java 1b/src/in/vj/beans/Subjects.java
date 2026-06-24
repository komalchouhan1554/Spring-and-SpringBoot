package in.vj.beans;

import java.util.ArrayList;
import java.util.List;

public class Subjects 
{
	List<String> lst = new ArrayList<String>();

	public void setLst(List<String> lst) {
		this.lst = lst;
	}
	
	@Override
	public String toString() {
		
		return lst.toString();
	}
}
