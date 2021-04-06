package com.libray.mng.controller;

import com.libray.mng.model.Books;
import com.libray.mng.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public List<Books> getAllBooks(){
        return bookService.getAllBooks();
    }
}
