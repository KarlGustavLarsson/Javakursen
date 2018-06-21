package test.database;



import test.Test;

import test.Book;

import java.util.List;

public interface IDataDAO {
    public List<Test> testFetch();
    public List<Test> getCinema();

	

	public List<Book> fetchBooks();
	public void addbook(Book book);
	public int update(Book book);
	int delete(int id);
	Book getBookById(int id);
	List<Book> fetchSelectedBooks(String search);
}
