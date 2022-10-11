package com.bilgeadam.boost.week07.lesson003.library;

public class Book {
	
	private String bookName;
	private String author;
	private long isbn;
	private int numOfBook;
	
	
	
	public Book() {
		super();
	}



	public Book(String bookName,String author, long isbn, int numOfBook) {
		super();
		this.bookName = bookName;
		this.author = author;
		this.isbn = isbn;
		this.numOfBook = numOfBook;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public long getIsbn() {
		return isbn;
	}



	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}



	public int getNumOfBook() {
		return numOfBook;
	}



	public void setNumOfBook(int numOfBook) {
		this.numOfBook = numOfBook;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", author=" + author + ", isbn=" + isbn + ", numOfBook=" + numOfBook
				+ "]";
	}



	
	
	
	

}
