package lms.business;
// comment made by ivan
import java.io.Serializable;

public class Book extends Publication implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String isbn;
	private boolean available;
	public Book(int id, String isbn, String title) {
		super(title);
		this.id = id;
		this.isbn = isbn;
	}
	public void isAvailable(boolean b) {
		available = b;
	}
	@Override
	public String toString() {
		return "id: " + id + ", isbn: " + isbn + ", available: " + available;
	}
}
