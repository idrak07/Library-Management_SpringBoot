package com.libray.mng.controller;

import com.libray.mng.model.Books;
import com.libray.mng.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/library/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(method = RequestMethod.GET, value = "")
    public List<Books> getAllBooks(){
        return bookService.getAllBooks();
    }

    @RequestMapping(method = RequestMethod.POST , value = "")
    public void addBook(@RequestBody Books books){
        bookService.addBook(books);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Books getBooks(@PathVariable Integer id){
        return bookService.getBooks(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/names/{name}")
    public Optional<Books> getBooksByName(@PathVariable String name){
        return bookService.getBooksByName(name);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/update/{id}")
    public String  updateBooks(@RequestBody Books books, @PathVariable Integer id){
        int flag= bookService.updateBooks(books, id);
        if(flag==1){
            return "Book with this id has been Updated";
        }
        else if(flag==2){
            return "Trying to breach Author Data";
        }

        else{
            return "No Book exists with this id";
        }
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/delete/{id}")
    public String deleteBooks(@PathVariable Integer id) {
        if(bookService.deleteBooks(id)){
            return "Book with this id has been deleted";
        }
        else{
            return "No Book exists with this id";
        }
    }
}
