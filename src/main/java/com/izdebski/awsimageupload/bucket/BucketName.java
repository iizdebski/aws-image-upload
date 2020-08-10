package com.izdebski.awsimageupload.bucket;

public enum BucketName {

    PROFILE_IMAGE("amigoscode-image-upload0607");

    private final String bucketName;

    public String getBucketName() {
        return bucketName;
    }

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}