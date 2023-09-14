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
    @Size(max = 500, message = "Location must be less than 500 characters")
    private String location;
    public Employer() {
    }
    public Employer(String location) {
        this.location = location;
    }
    @OneToMany(mappedBy = "employer")
    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();
}
        public String getLocation() {

    return location;
    }

    public void setLocation(String location) {

        this.location = location;
    }
    public List<Job> getJobs() {
        return jobs;
    }
}