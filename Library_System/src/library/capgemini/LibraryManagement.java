package library.capgemini;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LibraryManagement {
	
//	Scanner scan = new Scanner(System.in);
	InputStreamReader isrInputStreamReader = new InputStreamReader(System.in);
	BufferedReader bufferedReader = new BufferedReader(isrInputStreamReader);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryManagement mObjectLibraryManagement = new LibraryManagement();
		mObjectLibraryManagement.libraryController();

	}

	public void libraryController() {
		System.out.println("Welcome to Library Management System\n 1: Media Item \n 2: Written Item");
		int choice = 0;
		try {
			choice = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(choice == 1) {
			System.out.println("Enter Choice\n 1:Video\n 2:CD");
			int mediaChoice = 0;
			try {
				mediaChoice = Integer.parseInt(bufferedReader.readLine());
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(mediaChoice==1) {
				Video mObjectVideo = new Video();
				mObjectVideo.addMediaItem();
				mObjectVideo.show();
			}
			
			
		}else if (choice ==2) {
			
			
		}
		
	}
}
