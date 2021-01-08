package com.sbra.awsimage.profile;

import java.util.Optional;
import java.util.UUID;

public class UserProfile {

	private UUID userProfileId;
	private String username;
	private String userProfileLink; // S3 key

	public UserProfile(UUID userProfileId, String username, String userProfileLink) {
		this.userProfileId = userProfileId;
		this.username = username;
		this.userProfileLink = userProfileLink;
	}

	public UUID getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(UUID userProfileId) {
		this.userProfileId = userProfileId;
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
		result = prime * result + ((userProfileId == null) ? 0 : userProfileId.hashCode());
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
		if (userProfileId == null) {
			if (other.userProfileId != null)
				return false;
		} else if (!userProfileId.equals(other.userProfileId))
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
