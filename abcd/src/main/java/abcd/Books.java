package abcd;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	
	private String bookName;
	
	private String author;
	
	private int publishYear;
	
	
	
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Books(int bookId, String bookName, String author, int publishYear) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.author = author;
		this.publishYear = publishYear;
	}



	public int getBookId() {
		return bookId;
	}



	public void setBookId(int bookId) {
		this.bookId = bookId;
	}



	public String getBookName() {
		return bookName;
	}



	public void setBookName(String bookName) {
		this.bookName = bookName;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getPublishYear() {
		return publishYear;
	}



	public void setPublishYear(int publishYear) {
		this.publishYear = publishYear;
	}



	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", author=" + author + ", publishYear="
				+ publishYear + "]";
	}
	
	
}
