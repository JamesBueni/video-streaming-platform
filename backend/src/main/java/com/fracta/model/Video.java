package com.fracta.model;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "Videos")
@Builder
public class Video {
	
	private String id;
	private String title;
	private String description;
	private String userId;
	private String url;
	private String thumbnailUrl;
	private List<String> tags;
	private AtomicInteger likes = new AtomicInteger();
	private AtomicInteger dislikes = new AtomicInteger();
	private int viewCount;
	private VideoStatus videoStatus;
	private List<Comment> comments = new ArrayList<>();
	
	public int getLikeCount() {
		return likes.get();
	}
	
	public int getDislikeCount() {
		return dislikes.get();
	}
	
	public void increaseLikeCount() {
		likes.incrementAndGet();
	}
	
	public void increaseDislikeCount() {
		dislikes.incrementAndGet();
	}
	
	public void decreaseLikeCount() {
		likes.decrementAndGet();
	}
	
	public void decreaseDislikeCount() {
		dislikes.decrementAndGet();
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
}