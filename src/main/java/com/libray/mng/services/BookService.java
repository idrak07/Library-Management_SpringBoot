package com.libray.mng.services;

import com.libray.mng.model.Book;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class BookService {
    List<Book> books= Arrays.asList(
            new Book("book-01", "C++", 10, 100),
            new Book("book-02", "Java", 5, 520),
            new Book("book-03", "C#", 7, 340),
            new Book("book-04", "PHP", 8, 150)
    );
    public List<Book> getBooks(){
        return books;
    }

    public Book getBook(String id){
        return books.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
}
