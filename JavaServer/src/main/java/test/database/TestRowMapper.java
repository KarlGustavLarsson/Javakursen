package test.database;

import org.springframework.jdbc.core.RowMapper;
import test.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TestRowMapper implements RowMapper<Test> {
    @Override
    public Test mapRow(ResultSet row, int i) throws SQLException {
        Test test = new Test();
        test.add("id", row.getString("id"));
        test.add("movie_id", row.getString("movie_id"));
        test.add("theatre_id", row.getString("theatre_id"));
        test.add("starttime", row.getString("starttime"));
        test.add("endtime", row.getString("endtime"));
        return test;
    }
}
