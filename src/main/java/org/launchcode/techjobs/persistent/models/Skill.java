package org.launchcode.techjobs.persistent.models;

public class Skill extends AbstractEntity {
private String description;

    public Skill() {

    public Skill(String description) {
            this.description = description;
        }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}

}