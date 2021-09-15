package com.fracta.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.fracta.model.Video;
import com.fracta.repo.VideoRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VideoService {

	private final S3Service s3Service;
	private final VideoRepo videoRepo;
	
	public void uploadVideo(MultipartFile file) {
		var videoUrl = s3Service.uploadFile(file);
		var video = new Video();
		video.setUrl(videoUrl);
		
		videoRepo.save(video);
	}
}