package pkgLibrary;

public class BookException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ID;

	public BookException(String ID) {
		this.ID = ID;
	}
	
	public BookException(Book bk, String string) {
		Book booksies = bk;
		
	}

	public String getID(){
		return this.ID;
	}
	

	
}
