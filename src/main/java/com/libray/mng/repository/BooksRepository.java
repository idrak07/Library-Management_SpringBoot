package com.libray.mng.repository;

import com.libray.mng.model.Books;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BooksRepository extends CrudRepository<Books,Integer> {
    @Override
    List<Books> findAll();
}
