package com.thoughtworks.capability.gtb.entrancequiz.dto;

public class Group {
    private String groupName;

    public Group(String groupName){
        this.groupName = groupName;
    }

    public Group(){

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
