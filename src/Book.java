
public class Book {
	
	private String title;
	private int pages;
	private String author;
	private String publisher;
	
//	CONSTRUCTOR
	public Book ( String title, int pages, String author, String publisher) {
		
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setPublisher(publisher);
	}

//	GETTERS AND SETTERS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
