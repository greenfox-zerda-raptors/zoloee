package com.greenfox.zolo.reddit;


import com.greenfox.zolo.reddit.Models.Post;
import com.greenfox.zolo.reddit.Services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class W10d2TheredditApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(W10d2TheredditApplication.class, args);
	}

	@Autowired
	private PostRepository repository;

	@Override
	public void run(String... strings) throws Exception {
		for (int i = 0; i < 10; i++) {
			repository.save(new Post("mycontent" + (i+1)));
		}
	}
}
