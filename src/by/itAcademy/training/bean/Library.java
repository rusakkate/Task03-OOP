package by.itAcademy.training.bean;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Library {
	private Book[] books;
	private int sizeLibrary;
	private int numberBooks;
	
	private static final int DEFAULTSIZE = 5;
	
	public Library (int sizeLibrary) {
		numberBooks = 0;
		this.sizeLibrary = sizeLibrary;
		books = new Book [sizeLibrary];
	}
	
	public Library () {
		this (DEFAULTSIZE);
		
	}
	
	public Book[] getBooks() {
		return books;
	}

	public int getSizeLibrary() {
		return sizeLibrary;
	}

	public int getNumberBooks() {
		return numberBooks;
	}

	public void setBooks(Book[] books) {
		this.books = books;
	}

	public void setSizeLibrary(int sizeLibrary) {
		this.sizeLibrary = sizeLibrary;
	}

	public void setNumberBooks(int numberBooks) {
		this.numberBooks = numberBooks;
	}
	

}
