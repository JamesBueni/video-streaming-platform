package com.fracta.model;

import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {

	@Id
	private String id;
	private String content;
	private String author;
	private AtomicInteger likes = new AtomicInteger();
	private AtomicInteger dislikes = new AtomicInteger();

	public int getLikeCount() {
		return likes.get();
	}

	public int getDislikeCount() {
		return dislikes.get();
	}
}