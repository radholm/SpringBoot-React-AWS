package com.sbra.awsimage.bucket;

public enum BucketName {
	PROFILE_IMAGE("radholm-image");

	private final String bucketName;

	private BucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getBucketName() {
		return bucketName;
	}

}
