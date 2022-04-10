package by.itAcademy.training.main;
import by.itAcademy.training.bean.Book;
import by.itAcademy.training.logic.LibraryLogic;
import by.itAcademy.training.view.LibraryView;


public class Main {

	public static void main(String[] args) {
		LibraryLogic nationalLibrary = new LibraryLogic();
		LibraryView view = new LibraryView();
		
		nationalLibrary.addBookInLibrary (createBook(10001, "Green mile", "King", "Eksmo", 2015));
		nationalLibrary.addBookInLibrary (createBook(10002, "Doctor sleep", "King", "ABC", 2018));
		nationalLibrary.addBookInLibrary (createBook(10003, "Tragedy", "Evrepid", "Cosmo", 1998));
		nationalLibrary.addBookInLibrary (createBook(10004, "Secret friend", "Muni", "BookClub", 2008));
		nationalLibrary.addBookInLibrary (createBook(10005, "Dinner", "Tayler", "ABC", 2015));
		nationalLibrary.addBookInLibrary (createBook(10006, "Missing", "Muni", "Eksmo", 2020));
		nationalLibrary.addBookInLibrary (createBook(10007, "Light in august", "Folkner", "BookClub", 1975));
		nationalLibrary.addBookInLibrary (createBook(10008, "Fog", "King", "Eksmo", 2018));
		nationalLibrary.addBookInLibrary (createBook(10009, "Gone with the wing", "Mitchel", "BookClub", 1980));
		
		view.print(nationalLibrary.findWriterBooks());
		view.print(nationalLibrary.findPublishBooks());
		view.print(nationalLibrary.findAfterYearPublish());
		

	}
	
	private static Book createBook(int id, String name, String writer, String publish, int yearPublish) {
		Book book = new Book();
		book.setId(id);
		book.setName(name);
		book.setWriter(writer);
		book.setPublish(publish);
		book.setYearPublish(yearPublish);
		return book;
	}
}
