package com.example.demo.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.entity.ImageEntity;
import com.example.demo.repository.ImageEntityRepository;

@RestController
public class ImageEntityController {
	private ImageEntityRepository imageEntityRepository;

	public ImageEntityController(ImageEntityRepository imageEntityRepository) {
		this.imageEntityRepository = imageEntityRepository;
	}

	@GetMapping(value = "/image", produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<ImageEntity> getImages() {
        return imageEntityRepository.findAll();
    }

    @GetMapping(value = "/image/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ImageEntity getImage(@PathVariable long id){
        return imageEntityRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Invalid image id %s", id)));
    }

    @PostMapping(value = "/image", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ImageEntity createRide(@RequestBody ImageEntity imageEntity) {
        return imageEntityRepository.save(imageEntity);
    }
	
}
