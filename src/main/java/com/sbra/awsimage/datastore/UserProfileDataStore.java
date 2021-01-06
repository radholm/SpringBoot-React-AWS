package com.sbra.awsimage.datastore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.sbra.awsimage.profile.UserProfile;

import org.springframework.stereotype.Repository;

@Repository
public class UserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "radholm", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
