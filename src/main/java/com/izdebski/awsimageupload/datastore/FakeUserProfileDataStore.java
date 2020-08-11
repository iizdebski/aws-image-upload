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
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "cafe", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "restaurant", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}