package com.libray.mng.controller;
import com.libray.mng.model.Authors;
import com.libray.mng.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.parameters.P;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorsService authorsService;

    @RequestMapping(method = RequestMethod.GET, value = "/all-authors")
    public List<Authors> getAllAuthors(){
        return authorsService.getAllAuthors();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add-authors")
    public String addNewAuthors(@RequestBody Authors authors)
    {
        if(authorsService.addNewAuthors(authors)){
            return "Author added";
        }
        else
        {
            return "Problems found";
        }

    }

    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public RedirectView getAuthorsById(@PathVariable Integer id){
        RedirectView redirectView= new RedirectView();
        if(authorsService.getAuthorsById(id).isEmpty()){
            redirectView.setUrl("/authors/view/not-found");
        }
        else{
            redirectView.setUrl("/authors/view/found");
        }
        return redirectView;
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public String deleteAuthor(@PathVariable Integer id){
        if(authorsService.getAuthorsById(id).isEmpty()){
            return "Author not found";
        }
        else{
            if (authorsService.deleteAuthorById(id)){
                return "Author Deleted";
            }
            else {
                return  "Something wrong";
            }
        }
    }


}
