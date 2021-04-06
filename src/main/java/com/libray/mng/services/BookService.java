package com.libray.mng.services;

import com.libray.mng.model.Books;
import com.libray.mng.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private  BooksRepository booksRepository;

    public List<Books> getAllBooks(){
        List<Books> books= new ArrayList<>();
        booksRepository.findAll().forEach(books::add);
        return books;
    }
}
