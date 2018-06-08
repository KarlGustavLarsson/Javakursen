package test.database;

import test.Movie;
import test.Show;
import test.Test;
import test.Theatre;
import test.Book;

import java.util.List;

public interface IDataDAO {
    public List<Test> testFetch();
    public List<Test> getCinema();
	public List<Show> fetchShows();
	public List<Movie> fetchMovies();
	public List<Theatre> fetchTheatres();
	public List<Book> fetchBooks();
}
