package com.test;

public class File_Reader_Manager {
	private File_Reader_Manager(){
		//TODO Auto-generated constructor stub 
	}
	public static File_Reader_Manager getInstance() {
		//TODO Auto-denerated method stub
		File_Reader_Manager helper = new File_Reader_Manager();
		return helper;
		
	}
	public Configuration_Reader getInstanceCR() throws Throwable {
		//TODO auto-generated method stub
		Configuration_Reader reader = new Configuration_Reader();
		return reader;
		
	}

}
