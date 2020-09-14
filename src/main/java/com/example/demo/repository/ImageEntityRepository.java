package com.example.demo.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ImageEntity;

@Repository
public interface ImageEntityRepository extends CrudRepository<ImageEntity, Long>{
//	List<ImageEntity> findByName(String imageName);
}
