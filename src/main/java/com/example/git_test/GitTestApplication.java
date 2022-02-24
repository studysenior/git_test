package com.example.git_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class GitTestApplication {

	@GetMapping("/")
	public void goHome() {
		System.out.println("branch test #1");
		System.out.println("branch test #2");
		System.out.println("branch test #3");
		System.out.println("branch test #4");
		System.out.println("branch test #5");
		System.out.println("branch test #6");
		System.out.println("branch test #7");
		System.out.println("branch test #8");
	}
    public static void main(String[] args) {
        SpringApplication.run(GitTestApplication.class, args);
    }

}
