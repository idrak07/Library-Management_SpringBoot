package com.libray.mng.repository;

import com.libray.mng.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Books, Integer> {
    Books findBooksById(Integer id);
    Optional<Books> findByName(String name);

}
