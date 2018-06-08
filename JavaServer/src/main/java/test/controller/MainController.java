package test.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import test.Movie;
import test.Show;
import test.Test;
import test.Theatre;
import test.Book;
import test.database.DataDAO;
import test.database.IDataDAO;


@Controller
public class MainController {

    @Autowired
    private IDataDAO dataDao;

    //@Value("${application.message:Hello World}")
    private String message = "Hello World test";

   
    
    @GetMapping("/")
    public String welcome(Map<String, Object> model, String query1) {

    	Test t = new Test();
    	model.put("test", t);
        model.put("time", new Date());
        model.put("message", message);
        return "welcome";
    }


    @RequestMapping(value= "/foo", method = RequestMethod.GET)
    public String foo(Map<String, Object> model) {
        String result = dataDao.testFetch().toString();
        model.put("message1", result);
        return "welcome";
    }
    
    @GetMapping("/shows")
    public String shows(Map<String, Object> model, String query1) {
    	List<Show> theShows = dataDao.fetchShows();
    	List<Movie> theMovies = dataDao.fetchMovies();
    	List<Theatre> theTheatres = dataDao.fetchTheatres();
    	model.put("shows", theShows);
    	model.put("movies", theMovies);
    	model.put("theatres", theTheatres);
        return "shows";
    }
    
    @GetMapping("/books")
    public String books(Map<String, Object> model, String query1) {
    	List<Book> theBooks = dataDao.fetchBooks();
    	model.put("books", theBooks);
        return "books";
    }
    
    @GetMapping("/index")
    public String index(Map<String, Object> model, String query1) {

    	Test t = new Test();
    	model.put("test", t);
        model.put("time", new Date());
        model.put("message", message);
        return "testa";
    }

}