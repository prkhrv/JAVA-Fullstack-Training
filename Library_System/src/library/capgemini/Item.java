package library.capgemini;

import java.util.Scanner;

public class Item {
	
	Scanner scan = new Scanner(System.in);
	
	public Item() {
		System.out.println("Welcome to Library Management System");
		
		
	}
	
	int _id,noOfCopies;
	
	
	public int get_id() {
		return _id;
	}
	public void set_id(int _id) {
		this._id = _id;
	}
	public int getNoOfCopies() {
		return noOfCopies;
	}
	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	String title = new String();

}
