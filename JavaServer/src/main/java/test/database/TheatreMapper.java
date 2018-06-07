package test.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;

import test.Movie;
import test.Theatre;

public class TheatreMapper implements RowMapper {

	
	@Override
	public Theatre mapRow(ResultSet rs, int rowNum) throws SQLException {
	
		Theatre aTheatre = new Theatre();
		
		aTheatre.setId(rs.getInt("id"));
		aTheatre.setName(rs.getString("name"));

		return aTheatre;
	}

}
