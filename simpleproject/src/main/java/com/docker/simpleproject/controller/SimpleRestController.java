package com.docker.simpleproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
	
	@GetMapping("/home")
	public ResponseEntity<String> home(){
		return new ResponseEntity<String>("Hello, WOrld!!",HttpStatus.OK);
	}
}
