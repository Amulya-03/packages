package com.library.app;
import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {
	
	public static void main(String[] args) 
	{
		Library l = new Library();
		l.setLibraryName("Tale Spin Library");
		l.setTotalBooks(1200);
		

		Librarian lib = new Librarian();
		lib.setLibrarianName("Murthy");
		lib.setYearsOfExperience(12);

		l.showLibraryDetails();
		System.out.println();
		lib.showEngineDetails();
	}
}


