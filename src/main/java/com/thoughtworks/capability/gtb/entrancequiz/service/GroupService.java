package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Group;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupService {
    public List<Group> groupList = initGroups();

    private List<Group> initGroups() {
        List<Group> list = new ArrayList<>();
        list.add(new Group("Team 1"));
        list.add(new Group("Team 2"));
        list.add(new Group("Team 3"));
        list.add(new Group("Team 4"));
        list.add(new Group("Team 5"));
        list.add(new Group("Team 6"));
        return list;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public ResponseEntity modifyGroupName(int index, Group group) {
        Group group1 = groupList.get(index-1);
        for(Group group2 : groupList){
            if (group.getGroupName() == group2.getGroupName()){
                return ResponseEntity.status(HttpStatus.CONFLICT).build();
            }
        }
        if (group.getGroupName()!=null){
            group1.setGroupName(group.getGroupName());
        }
        return ResponseEntity.ok().build();
    }
}
