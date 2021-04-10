package com.libray.mng.services;

import com.libray.mng.model.Books;
import com.libray.mng.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private  BooksRepository booksRepository;

    public List<Books> getAllBooks(){
        List<Books> books= new ArrayList<>();
        booksRepository.findAll().forEach(books::add);
        return books;
    }

    public void addBook(Books books){
        booksRepository.save(books);
    }

    public Books getBooks(Integer id){
        return booksRepository.findBooksById(id);
    }

    public Optional<Books> getBooksByName(String name){
        return booksRepository.findByName(name);
    }

    public int updateBooks(Books books, Integer id){
        int flag;
        flag=0;
        try{
            if(booksRepository.existsById(id)){
                Books books1= booksRepository.findBooksById(id);
                books1.setName(books.getName());
                books1.setAuthorId(books.getAuthorId());
                books1.setQty(books.getQty());
                books1.setPrice(books.getPrice());
                booksRepository.save(books1);
                flag=1;
            }
            else {

            }
            return flag;
        }
        catch (Exception e){
            flag=2;
            System.out.println(e.getMessage());
            return flag;
        }
    }

    public boolean deleteBooks(Integer id){
        if(booksRepository.existsById(id)){
            booksRepository.delete(booksRepository.getOne(id));
            return true;
        }
        else{
            return false;
        }
    }

}
