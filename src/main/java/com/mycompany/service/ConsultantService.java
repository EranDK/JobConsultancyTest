package com.mycompany.service;

import com.mycompany.model.User;
import com.mycompany.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultantService {

    @Autowired
    private UserRepository repo;

    public void save(User user){

        repo.save(user);
    }


}

