package by.itAcademy.training.logic;

import by.itAcademy.training.bean.Book;
import by.itAcademy.training.bean.Library;
import by.itAcademy.training.input.InputConditions;

public class LibraryLogic {
	Library library = new Library();
	
	public Library addBookInLibrary (Book book) {
		if ( library.getNumberBooks() < library.getSizeLibrary() ) {
			library.getBooks()[library.getNumberBooks()] = book;
			library.setNumberBooks(library.getNumberBooks() + 1);
		} else {
			Book[] buffer = new Book [library.getSizeLibrary() * 2];
			for (int i = 0; i <library.getNumberBooks(); i++) {
				buffer[i] = library.getBooks()[i];
			}
			library.setBooks(buffer);
			library.setSizeLibrary(library.getSizeLibrary() * 2);
			library.getBooks()[library.getNumberBooks()] = book;
			library.setNumberBooks(library.getNumberBooks() + 1);
		}
		return library;
	}
	
	public Book[] findWriterBooks () {
		
		InputConditions iputCondition = new InputConditions();
		String findWriterBooks;
		findWriterBooks = iputCondition.inputString("Enter writer");
		
		int countWriterBooks;
		countWriterBooks = 0;
		for (int i = 0; i < library.getNumberBooks(); i++) {
			if (findWriterBooks.equals(library.getBooks()[i].getWriter())) {
				countWriterBooks++;
			}
		}
		
		Book[] book = new Book[countWriterBooks];
		for (int i = 0, j = 0; i < library.getNumberBooks(); i++) {
			if (findWriterBooks.equals(library.getBooks()[i].getWriter())) {
				book[j] = library.getBooks()[i];
				j++;
			}
		}
		return book;
	}
	
	public Book[] findPublishBooks () {
		
		InputConditions iputCondition = new InputConditions();
		String findPublishBooks;
		findPublishBooks = iputCondition.inputString("Enter publish");
		
		int countPublishBooks;
		countPublishBooks = 0;
		for (int i = 0; i < library.getNumberBooks(); i++) {
			if (findPublishBooks.equals(library.getBooks()[i].getPublish())) {
				countPublishBooks++;
			}
		}
		
		Book[] book = new Book[countPublishBooks];
		for (int i = 0, j = 0; i < library.getNumberBooks(); i++) {
			if (findPublishBooks.equals(library.getBooks()[i].getPublish())) {
				book[j] = library.getBooks()[i];
				j++;
			}
		}
		return book;
	}
	
	public Book[] findAfterYearPublish () {
		
		InputConditions iputCondition = new InputConditions();
		int afterYearPublish;
		afterYearPublish = iputCondition.inputInt("Enter YearPublish");
		
		int countafterYearPublishBooks;
		countafterYearPublishBooks = 0;
		for (int i = 0; i < library.getNumberBooks(); i++) {
			if ( afterYearPublish <= library.getBooks()[i].getYearPublish() ) {
				countafterYearPublishBooks++;
			}
		}
		
		Book[] book = new Book[countafterYearPublishBooks];
		for (int i = 0, j = 0; i < library.getNumberBooks(); i++) {
			if (afterYearPublish <= library.getBooks()[i].getYearPublish()) {
				book[j] = library.getBooks()[i];
				j++;
			}
		}
		return book;
	}
	
	
	/*
	
	public void findAfterYearPublish() {
		int afterYearPublish;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter YearPublish ");
		afterYearPublish = sc.nextInt();
		for (int i = 0; i < numberBooks; i++) {
			if (afterYearPublish < books[i].getYearPublish()) {
				System.out.println (books[i].toString());
			}
		}
	}*/


}
