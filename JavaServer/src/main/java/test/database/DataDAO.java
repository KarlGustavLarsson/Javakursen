package test.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;



import test.Test;

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
	public List<Book> fetchBooks() {
		// TODO Auto-generated method stub
		String query = "SELECT * from library.book";
        return jdbcTemplate.query(query, new BookMapper());
		
	} 
	
	@Override
	public void addbook(Book book) {
		
		jdbcTemplate.update(
			    "INSERT INTO library.book (title, author,published) VALUES (?,?,?)", book.getTitle(),book.getAuthor(),book.getPublished());
        
	} 
	
	@Override
	public int update(Book book){  
		String SQL = "update library.book set title = ?, author = ? , published = ?  where id = ?";
		
	      return jdbcTemplate.update(SQL, book.getTitle(), book.getAuthor(), book.getPublished(), book.getId());
		     
    }  

	
	@Override
	public List<Test> getCinema() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
