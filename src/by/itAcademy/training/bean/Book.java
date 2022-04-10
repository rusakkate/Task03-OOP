package by.itAcademy.training.bean;

import java.util.Objects;

public class Book {
	private int id;
	private String name;
	private String writer;
	private String publish;
	private int yearPublish;
	private int pageNumber;
	private int price;
	private String bindingType;
	
	public Book (int id, String name, String writer, String publish, int yearPublish) {
		this.setId(id);
		this.name = name;
		this.writer = writer;
		this.publish = publish;
		this.yearPublish = yearPublish;
	}
	
	public Book() {
	}

	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getWriter() {
		return writer;
	}
	public String getPublish() {
		return publish;
	}
	public int getYearPublish() {
		return yearPublish;
	}
	public int getPageNumber() {
		return pageNumber;
	}
	public int getPrice() {
		return price;
	}
	public String getBindingType() {
		return bindingType;
	}
	public void setId(int id) {
		if (id < 0) {
			throw new RuntimeException ("id cannot be less than zero");
		} else {
			this.id = id;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setPublish(String publish) {
		this.publish = publish;
	}
	public void setYearPublish(int yearPublish) {
		if (yearPublish < 1800 || yearPublish > 2022) {
			throw new RuntimeException ("Check publication year");
		} else {
			this.yearPublish = yearPublish;
		}
	}
	
	public void setPageNumber(int pageNumber) {
		if (pageNumber < 0) {
			throw new RuntimeException ("Number of pages cannot be a negative number");
		} else {
			this.pageNumber = pageNumber;
		}
	}
	public void setPrice(int price) {
		if (price < 0) {
			throw new RuntimeException ("Price cannot be a negative number");
		} else {
			this.price = price;
		}
	}
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id;
	}
	
	

	public String toString () {
		String str = "";
		str = id + ": " + name + ", " + writer + ", " + publish + ", " + yearPublish;
		return str;
	}
	

}

