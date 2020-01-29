package library.capgemini;

import java.util.Scanner;

public class LibraryManagement {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryManagement mObjectLibraryManagement = new LibraryManagement();
		mObjectLibraryManagement.libraryController();

	}

	public void libraryController() {
		System.out.println("Welcome to Library Management System\n 1: Media Item \n 2: Written Item");
		int choice = scan.nextInt();
		if(choice == 1) {
			MediaItem mObject = new MediaItem() {
				
				@Override
				public void show() {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void showMediaItem() {
					// TODO Auto-generated method stub
					
				}
			};
			
		}else if (choice ==2) {
			WrittenItem mObjectItem = new WrittenItem() {
				
				@Override
				public void show() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void showWrittenItem() {
					// TODO Auto-generated method stub
					
				}
			};
			
		}
		
	}
}
