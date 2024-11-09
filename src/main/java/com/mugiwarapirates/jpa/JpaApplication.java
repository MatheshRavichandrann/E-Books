package com.mugiwarapirates.jpa;
import com.mugiwarapirates.jpa.model.Author;
import com.mugiwarapirates.jpa.model.Video;
import com.mugiwarapirates.jpa.repo.AuthorRepository;
import com.mugiwarapirates.jpa.repo.VideoRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner(AuthorRepository repository){
//		return args -> {
//			var name = Author.
//		};
//
//	}

//	@Bean
//	public CommandLineRunner commandLineRunner(VideoRepo videoRepo) {
//		return args -> {
//			var video = Video.builder
//
//		};
//	}
}
