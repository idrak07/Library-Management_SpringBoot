package com.libray.mng.repository;

import com.libray.mng.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorsRepository extends JpaRepository<Authors, Integer> {
    public Authors findAuthorsByAuthorid(Integer authorId);
}
