package edu.remad.oauth2_resource_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	@GetMapping("/hello")
	public String hello() {
		return "hello from resource server";
	}
}
