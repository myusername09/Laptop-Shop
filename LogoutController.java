

package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Logout;
import com.example.demo.Repo.LogoutRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class LogoutController {
     @Autowired
	 private LogoutRepository repo;
     
     @PostMapping("/loggedout")
     public ResponseEntity<Logout>userLogout(@RequestBody Logout loggedout){
    	 return ResponseEntity.ok(repo.save(loggedout));
     }
}
