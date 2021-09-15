package com.fracta.model;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(value = "Users")
public class User {

	private String id;
	private String firstName;
	private String lastName;
	private String fullName;
	private String picture;
	private String emailAddress;
	private String sub;
	private Set<String> subscribedToUsers = new HashSet<>();
	private Set<String> subscribers = new HashSet<>();
	private Set<String> videoHistory = new LinkedHashSet<>();
	private Set<String> likedVideos = new HashSet<>();
	private Set<String> dislikedVideos = new HashSet<>();
	
	public void addToSubscribers(String userId) {
		subscribers.add(userId);
	}
	
	public void removeFromSubscribers(String userId) {
		subscribers.remove(userId);
	}
	
	public void addToLikedVideos(String videoId) {
		likedVideos.add(videoId);
	}
	
	public void removeFromLikedVideos(String videoId) {
		likedVideos.remove(videoId);
	}
	
	public void addToDislikedVideos(String videoId) {
		dislikedVideos.add(videoId);
	}
	
	public void removeFromDislikedVideos(String videoId) {
		dislikedVideos.remove(videoId);
	}
	
	public void addToSubscribedUsers(String userId) {
		subscribedToUsers.add(userId);
	}
	
	public void removeFromSubscribedUsers(String userId) {
		subscribedToUsers.remove(userId);
	}
	
	public void addToVideoHistory(String videoId) {
		videoHistory.add(videoId);
	}
}