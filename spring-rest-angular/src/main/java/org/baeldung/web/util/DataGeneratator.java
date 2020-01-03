package org.baeldung.web.util;

public class DataGeneratator {
	
	public static void main(String[] args)
	{
		int id=21;
		while(id<1000)
		{
		String row="INSERT INTO student (id,name,gender,age) VALUES ("+id+",'AJAY"+id+"', 'Female',26)";
		System.out.println(row);
		id++;
		}
	}

}
