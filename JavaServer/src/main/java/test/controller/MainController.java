package test.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import test.Test;

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
    
   
    
    @GetMapping("/books")
    public String books(Map<String, Object> model, String query1) {
    	List<Book> theBooks = dataDao.fetchBooks();
    	model.put("books", theBooks);
        return "books";
    }
    
    @GetMapping("/addbook")
    public  String addbookget(@ModelAttribute("Book")Book book) {
    	
    	/* model.addAttribute("title", book.getTitle());
        model.addAttribute("author", book.getAuthor());
        model.addAttribute("published", book.getPublished()); */
    	
    	//dataDao.addbook(book);
    	//model.put("addbook", dataDao.addbook(title, author, published));
         return "addbook";
    }
    
    @PostMapping("/addbook")
    public String addbook(@Valid @ModelAttribute("Book")Book book) {
    	
    	/* model.addAttribute("title", book.getTitle());
        model.addAttribute("author", book.getAuthor());
        model.addAttribute("published", book.getPublished()); */
    	
    	dataDao.addbook(book);
    	//model.put("addbook", dataDao.addbook(title, author, published));
        return "redirect:/books";
    }
    
    
    /* It displays object data into form for the given id.  
         * The @PathVariable puts URL data into variable.*/  
        @GetMapping(value="/editbook/{id}")  
        public String edit(Map<String, Object> model, @ModelAttribute("Book")Book book, @PathVariable int id){  
            book = dataDao.getBookById(id); 
            System.out.println(book.getAuthor());
            model.put("book", book);
            return  "edit";  
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