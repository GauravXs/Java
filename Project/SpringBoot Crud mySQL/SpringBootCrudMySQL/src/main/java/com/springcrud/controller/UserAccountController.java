package com.springcrud.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springcrud.model.UserAccount;
import com.springcrud.services.UserAccountService;


 
import org.springframework.web.bind.annotation.*;

@RestController
public class UserAccountController {
	
	@Autowired
    private UserAccountService service;
 // RESTful API methods for Retrieval operations
    @GetMapping("/accounts")
public List<UserAccount> list() {
    return service.listAll();
}
 // RESTful API methods for Create operations
    @PostMapping("/accounts")
    public void add(@RequestBody UserAccount account) {
        service.save(account);
    }
 // RESTful API methods for retrieving  
    @GetMapping("/accounts/{id}")
    public ResponseEntity<UserAccount> get(@PathVariable Integer id) {
        try {
        	UserAccount account = service.get(id);
            return new ResponseEntity<UserAccount>(account, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<UserAccount>(HttpStatus.NOT_FOUND);
        }      
    }
 // RESTful API methods for update(put) by id
    @PutMapping("/accounts/{id}")
    public ResponseEntity<?> update(@RequestBody UserAccount account, @PathVariable Integer id) {
        try {
        	//UserAccount existAccount = service.get(id);
            service.save(account);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
 // RESTful API methods for delete by id
    @DeleteMapping("/accounts/{id}")
    public void delete(@PathVariable Integer id) {
        service.delete(id);
    }

}