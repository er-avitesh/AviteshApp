package com.project.brownie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@RequestMapping("/info")
	public String Appinfo() {
		return "Apps is Running";
	}

	@RequestMapping("/gradle")
	public String gradleEndpoint() {
		return "This is my gradle version";
	}
}
