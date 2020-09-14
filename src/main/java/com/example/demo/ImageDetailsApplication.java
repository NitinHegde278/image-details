package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entity.ImageEntity;
import com.example.demo.repository.ImageEntityRepository;


@SpringBootApplication
public class ImageDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImageDetailsApplication.class, args);
	}
	
	@Bean
    public CommandLineRunner sampleData(ImageEntityRepository repository) {
        return (args) -> {
            repository.save(new ImageEntity(null,"Nitin", "http://image.com", true));
            repository.save(new ImageEntity(null,"Something", "http:some.com", false));
            repository.save(new ImageEntity(null,"Google", "http://google.com/image1",true));
        };
    }

}
