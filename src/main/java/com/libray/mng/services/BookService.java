package com.libray.mng.services;

import com.libray.mng.model.Books;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public interface BookService {

    /*List<Books> books= new ArrayList<>(Arrays.asList(
            new Books(1, "C++", 10, 100),
            new Books(2, "Java", 5, 520),
            new Books(3, "C#", 7, 340),
            new Books(4, "PHP", 8, 150)
    ));
    public List<Books> getBooks(){
        return books;
    }

    public Books getBook(int id){
        return books.stream().filter(t->t.getId()==id).findFirst().get();
    }

    public void addBook(Books book){
        books.add(book);
    }
    public void updateBook(int id, Books
            book){
        for (int i=0 ; i<books.size(); i++){
            Books b = books.get(i);
            if(b.getId()==id){
                books.set(i, book);
                return;
            }
        }
    }
    public void deleteBook(int id){
        books.removeIf(t-> t.getId()==id);
    }*/

    public List<Books> fetchAllBooks();

}
