package com.libray.mng.controller;

import com.libray.mng.model.Book;
import com.libray.mng.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {

    @Autowired
    private BookService bookService;


    @RequestMapping("/books/{id}")
    public Book getBooks(@PathVariable String id){
        return bookService.getBook(id);
    }

    @RequestMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }
}
