package com.example.PracticeJenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class JenkinsController {
	@GetMapping(value="/Name")
	public String getName() {
		return "Santhi";
	}

}
