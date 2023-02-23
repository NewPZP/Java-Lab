package io.github.newpzp.design.iterators.social_networks;

import io.github.newpzp.design.iterators.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}