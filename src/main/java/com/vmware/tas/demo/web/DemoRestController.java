package com.vmware.tas.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	@GetMapping("/hello")
	public String helloDemo() {
		return "Hello Demo @NewVersion";
	}
}
