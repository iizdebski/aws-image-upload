package com.izdebski.awsimageupload.datastore;


import com.izdebski.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("932ca16f-a22b-4cf0-b0a4-2a0db1743b08"), "cafe", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("27279b91-93c8-4a59-8454-d7e214cddfc1"),"restaurant", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}