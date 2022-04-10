package by.itAcademy.training.view;

import by.itAcademy.training.bean.Book;

import by.itAcademy.training.bean.Library;
import by.itAcademy.training.logic.LibraryLogic;

public class LibraryView {
	
	public void print (Library library) {
		if (library.getSizeLibrary() == 0) {
			System.out.println ("Books are missing from the library");
		} else {
			for (int i = 0; i < library.getSizeLibrary(); i++) {
				System.out.print (i + 1 + ". ");
				System.out.println(library.getBooks()[i].toString());
			}
		}
		
	}
	
	public void print (Book[] book) {
		if (book.length == 0) {
			System.out.println ("Books are missing from the library");
		} else {
			for (int i = 0; i < book.length; i++) {
				System.out.print (i + 1 + ". ");
				System.out.println(book[i].toString());
			}
		}
		
	}
	
	

}

/*str = print(f1);
str = str + (char)op;
str = str + print(f2);
str = str + "=";
str = str + print(rez);*/