package com.example.AuthSystem.service;

import com.example.AuthSystem.io.ProfileRequest;
import com.example.AuthSystem.io.ProfileResponse;

public interface ProfileService {

    ProfileResponse createProfile(ProfileRequest request);
}
