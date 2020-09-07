package com.thoughtworks.capability.gtb.entrancequiz.dto;

public class Group {
    private String name;

    public Group(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                '}';
    }
}
