package com.libray.mng.services;

import com.libray.mng.model.Authors;
import com.libray.mng.model.Books;
import com.libray.mng.repository.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AuthorsService{
    @Autowired
    private AuthorsRepository authorsRepository;

    public List<Authors> getAllAuthors(){
        List<Authors> authors= new ArrayList<>();
        authorsRepository.findAll().forEach(authors::add);
        return authors;
    }

    public boolean addNewAuthors(Authors authors){
        try{
            authorsRepository.save(authors);
            return true;
        }
        catch (Exception e){
            System.out.println(e.toString());
            return false;
        }
    }
    public Optional<Authors> getAuthorsById(Integer authorsId){

        return authorsRepository.findById(authorsId);
    }

    public int updateAuthors(Authors authors,Integer id){
        int flag;
        flag=0;
        try{
            if(authorsRepository.existsById(id)){
                Authors authors1= authorsRepository.findAuthorsByAuthorid(id);
                authors1.setAuthorname(authors.getAuthorname());
                authors1.setAuthorage(authors.getAuthorage());
                authors1.setPublishedbooks(authors.getPublishedbooks());
                authorsRepository.save(authors1);
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

    public boolean deleteAuthorById(Integer id){
        boolean flag;
        flag = false;
        try{
            if(authorsRepository.existsById(id)){
                authorsRepository.delete(authorsRepository.getOne(id));
                flag=true;
            }
            else{
            }
            return flag;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

        finally {
            System.out.println(flag);

        }
    }


}
