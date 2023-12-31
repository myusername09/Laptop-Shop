package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Neworder;
import com.example.demo.Repo.NeworderRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class NeworderController {
	@Autowired
	private NeworderRepository repo;
	@PostMapping("/neworder")
	public ResponseEntity<Neworder> NewOrder(@RequestBody Neworder neworder){
		return ResponseEntity.ok(repo.save(neworder));
		
	}

}
