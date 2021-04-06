package com.libray.mng.controller;

import com.libray.mng.model.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class MainController {
    /*Book book;*/

    @RequestMapping("/book")
    public Book getBooks(){
        return new Book(1,"Let us C", 5, 200.40);
    }

    @RequestMapping("/books")
    public List<Book> getAllBooks(){

        return Arrays.asList(
                new Book(1, "C++", 10, 100),
                new Book(2, "Java", 5, 520),
                new Book(3, "C#", 7, 340),
                new Book(4, "PHP", 8, 150)
        );
    }
}
