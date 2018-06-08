package test;



public class Book {
	
	private Integer id;
	private String title;
	private String author;
	private String published;
	
	
public Book() {
		
	}
	public Book(int id, String title, String author,String published ) {
		this.id     = id;
		this.title  = title;
		this.author = author;
		this.published = published;
		
		
	}	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublished() {
		return published;
	}
	public void setPublished(String published) {
		this.published = published;
	}
	
	
	
	

}
