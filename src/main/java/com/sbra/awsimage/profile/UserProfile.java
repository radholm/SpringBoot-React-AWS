package com.sbra.awsimage.profile;

import java.util.Optional;
import java.util.UUID;

public class UserProfile {

	private UUID userProfileID;
	private String username;
	private String userProfileLink; // S3 key

	public UserProfile(UUID userProfileID, String username, String userProfileLink) {
		this.userProfileID = userProfileID;
		this.username = username;
		this.userProfileLink = userProfileLink;
	}

	public UUID getUserProfileID() {
		return userProfileID;
	}

	public void setUserProfileID(UUID userProfileID) {
		this.userProfileID = userProfileID;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Optional<String> getUserProfileLink() {
		return Optional.ofNullable(userProfileLink);
	}

	public void setUserProfileLink(String userProfileLink) {
		this.userProfileLink = userProfileLink;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userProfileID == null) ? 0 : userProfileID.hashCode());
		result = prime * result + ((userProfileLink == null) ? 0 : userProfileLink.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfile other = (UserProfile) obj;
		if (userProfileID == null) {
			if (other.userProfileID != null)
				return false;
		} else if (!userProfileID.equals(other.userProfileID))
			return false;
		if (userProfileLink == null) {
			if (other.userProfileLink != null)
				return false;
		} else if (!userProfileLink.equals(other.userProfileLink))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
}
