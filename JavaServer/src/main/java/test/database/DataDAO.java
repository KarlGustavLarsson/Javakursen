package test.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import test.Movie;
import test.Show;
import test.Test;
import test.Theatre;
import test.Book;
import java.util.List;

@Transactional
@Repository
public class DataDAO implements IDataDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public DataDAO(){}

    public List<Test> testFetch(){
        String query = "SELECT * from show";
        return jdbcTemplate.query(query, new TestRowMapper());
    }

	@Override
	public List<Show> fetchShows() {
		// TODO Auto-generated method stub
		String query = "SELECT * from show";
        return jdbcTemplate.query(query, new ShowMapper());
	}

	
	@Override
	public List<Book> fetchBooks() {
		// TODO Auto-generated method stub
		String query = "SELECT * from library.book";
        return jdbcTemplate.query(query, new BookMapper());
		
	} 
	
	@Override
	public List<Test> getCinema() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Movie> fetchMovies() {
		String query = "Select * from movie";
		return jdbcTemplate.query(query, new MovieMapper());
	}

	@Override
	public List<Theatre> fetchTheatres() {
		String query = "Select * from theatre";
		return jdbcTemplate.query(query, new TheatreMapper());
	}

}
