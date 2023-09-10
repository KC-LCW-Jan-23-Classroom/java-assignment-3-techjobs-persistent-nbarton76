package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;

@Entity
public class Employer extends AbstractEntity {

    private String location;

    public Employer() {
    }

    public Employer(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String aLocation) {
        this.location = aLocation;
    }

    @Override
    public String toString() {
        return location;
    }
}