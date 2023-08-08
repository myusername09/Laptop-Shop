package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Footer;
import com.example.demo.Repo.FooterRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class FooterController {
	
	@Autowired
	private FooterRepository repo;
	
	@PostMapping("/footer")
	public ResponseEntity<Footer>SendFeed(@RequestBody Footer footer){
		return ResponseEntity.ok(repo.save(footer));
	}

}
