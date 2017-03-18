package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	

	@XmlElement(name="book")
	ArrayList<Book> books;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}


	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public Book getBook(String input_id) throws BookException {
		for (Book b : this.getBooks()){
			if (b.getId() == input_id) 
				return  b;
		}
		System.out.println("Enter a correct book id");

		throw new BookException(input_id);
	}
	
	public void AddBook(Book bk) throws BookException{
		for (Book b : this.getBooks()) {
			if (b.getId() == bk.getId()) {
				throw new BookException(bk, "already there");

			}
		}
		ArrayList<Book> booksies = this.getBooks();
		booksies.add(bk);
		this.setBooks(booksies);
	}


	public void AddBook(String id2, Book b) {
		String booksies = "string";
	}









}
