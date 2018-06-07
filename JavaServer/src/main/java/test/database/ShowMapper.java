package test.database;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import test.Show;

public class ShowMapper implements RowMapper<Show> {

	@Override
	public Show mapRow(ResultSet rs, int rowNum) throws SQLException {
		Show aShow = new Show();
		aShow.setId(rs.getInt("id"));
		aShow.setMovieId(rs.getInt("movie_id"));
		aShow.setTheatreId(rs.getInt("theatre_id"));
		aShow.setStart(rs.getTimestamp("starttime").toLocalDateTime());
		aShow.setEnd(rs.getTimestamp("endtime").toLocalDateTime());
		
		return aShow;
	}
}
