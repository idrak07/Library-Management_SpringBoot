package com.libray.mng.controller;
import com.libray.mng.model.Books;
import com.libray.mng.repository.BooksRepository;
import com.libray.mng.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private BookService bookService;

    private BooksRepository booksRepository;

    /*get All Books*/
    /*@RequestMapping("/books/{id}")*/
    /*public Books getBooks(@PathVariable int id){

        *//*return bookService.getBook(id);*//*
    }*/

    @RequestMapping("/books")
    public ResponseEntity<List<Books>> getAllBooks(){
        /*return bookService.getBooks();*/
        return  new ResponseEntity<>(bookService.fetchAllBooks(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST , value = "/books")
    public void addBook(@RequestBody Books book){
        /*bookService.addBook(book);*/
    }
    @RequestMapping(method = RequestMethod.PUT , value = "/books/{id}")
    public void updateBook(@RequestBody Books book, @PathVariable int id){
        /*bookService.updateBook(id, book);*/
    }

    @RequestMapping(method = RequestMethod.DELETE , value = "/books/{id}")
    public void deleteBook(@PathVariable int id){
        /*bookService.deleteBook(id);*/
    }


}
