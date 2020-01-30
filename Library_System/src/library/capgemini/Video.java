package library.capgemini;

import java.io.IOException;

public class Video extends MediaItem {
	
	private String director,genre;
	private int yearReleased;
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Title "+getTitle()+"\n ID "+get_id()+"\n No. of Copies"+getNoOfCopies()+"\n Director "+director+"\n Genre "+genre+"\n Year Released "+yearReleased);		
	}
	@Override
	public void addMediaItem() {
		// TODO Auto-generated method stub
		System.out.println("Enter Video name");
		String vidNameString = null;
		try {
			vidNameString = bufferedReader.readLine();
		} catch (IOException e5) {
			// TODO Auto-generated catch block
			e5.printStackTrace();
		}
		System.out.println("Enter ID");
		int id = 0;
		try {
			id = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		} catch (IOException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		System.out.println("Enter No. of Copies ?");
		int noOfCopies = 0;
		try {
			noOfCopies = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		} catch (IOException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		System.out.println("Enter Director Name?");
		try {
			director = bufferedReader.readLine();
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		System.out.println("enter Genre ");
		try {
			genre = bufferedReader.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Enter year Released");
		try {
			yearReleased = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		set_id(id);
		setNoOfCopies(noOfCopies);
		setTitle(vidNameString);
		
	}

}
