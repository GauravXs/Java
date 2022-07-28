package com.springcrud.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcrud.model.UserAccount;
import com.springcrud.model.UserAccountRepository;


	@Service
	@Transactional
	public class UserAccountService {
	 
	    @Autowired
	    private UserAccountRepository repo;
	     
	    public List<UserAccount> listAll() {
	        return repo.findAll();
	    }
	     
	    public void save(UserAccount useraccount) {
	        repo.save(useraccount);
	    }
	     
	    public UserAccount get(Integer id) {
	        return repo.findById(id).get();
	    }
	     
	    public void delete(Integer id) {
	        repo.deleteById(id);
	    }
	

}
