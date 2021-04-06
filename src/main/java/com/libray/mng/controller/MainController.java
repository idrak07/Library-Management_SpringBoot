package com.libray.mng.controller;

import com.libray.mng.model.Book;
import com.libray.mng.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private BookService bookService;

    /*get All Books*/
    @RequestMapping("/books/{id}")
    public Book getBooks(@PathVariable String id){
        return bookService.getBook(id);
    }

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }

    @RequestMapping(method = RequestMethod.POST , value = "/books")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }
    @RequestMapping(method = RequestMethod.PUT , value = "/books/{id}")
    public void updateBook(@RequestBody Book book, @PathVariable String id){
        bookService.updateBook(id, book);
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/books/{id}")
    public void deleteBook(@PathVariable String id){
        bookService.deleteBook(id);
    }


}
