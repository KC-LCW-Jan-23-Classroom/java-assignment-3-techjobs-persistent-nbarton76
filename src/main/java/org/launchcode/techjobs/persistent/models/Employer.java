package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    @NotBlank(message = "Location is required")
    @Size(min = 2, max = 500)
    private String location;

    @OneToMany(mappedBy = "employer")
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Employer() {
    }

        public String getLocation() {
        return location;
    }

    public void setLocation(String aLocation) {

        this.location = aLocation;
    }

    }
}