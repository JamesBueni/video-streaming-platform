package com.fracta.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.fracta.model.Video;

public interface VideoRepo extends MongoRepository<Video, String> {
	
}
