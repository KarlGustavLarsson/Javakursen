package test.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import test.Movie;
import test.Show;

public class MovieMapper implements RowMapper<Movie> {

	@Override
	public Movie mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Movie aMovie = new Movie();
		aMovie.setId(rs.getInt("id"));
		aMovie.setName(rs.getString("name"));
		aMovie.setDescription(rs.getString("description"));

		return aMovie;
	}
	

}
