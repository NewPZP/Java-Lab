package io.github.newpzp.design.iterators.iterators;

import io.github.newpzp.design.iterators.profile.Profile;

public interface ProfileIterator{
    boolean hasNext();

    Profile getNext();

    void reset();
}
