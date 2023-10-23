package com.fmtech.wsvendas.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fmtech.wsvendas.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserController {

	@GetMapping
	public ResponseEntity<User> findall() {
		User u = new User(1L, "Arthur", "arthurmarcatto@gmail.com", "1699999", "123");

		return ResponseEntity.ok().body(u);
	}
}
