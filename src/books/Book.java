package books;


public class Book {
	
	private String title;
	private int pages;
	private String author;
	private String publisher;
	
//	CONSTRUCTOR
	public Book ( String title, int pages, String author, String publisher) throws Exception {
		
		setTitle(title);
		setPages(pages);
		setAuthor(author);
		setPublisher(publisher);
	}

//	GETTERS AND SETTERS
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) throws Exception {
		
		if ( title .isEmpty()) {
			
			throw new Exception("il titolo non può essere vuoto");
		}
		this.title = title;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) throws Exception {
		
		if ( pages <= 0) {
			
			throw new Exception("Le pagine devono essere più di 0");
		}
		this.pages = pages;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) throws Exception {
		
		if ( author.isEmpty()) {
			
			throw new Exception("il titolo non può essere vuoto");
		}
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getTitle() + "\n" + getPages() + "\n" + getAuthor() + "\n" + getPublisher() + "\n" + "----------";
	}
	
	
}
