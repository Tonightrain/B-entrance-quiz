package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Group;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GroupController {
    public List<Group> groupList = initStudents();

    private List<Group> initStudents() {
        List<Group> list = new ArrayList<>();
        list.add(new Group("Team 1"));
        list.add(new Group("Team 2"));
        list.add(new Group("Team 3"));
        list.add(new Group("Team 4"));
        list.add(new Group("Team 5"));
        list.add(new Group("Team 6"));
        return list;
    }
}
