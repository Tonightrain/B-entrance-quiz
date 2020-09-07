package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.dto.Group;
import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GroupController {

    @Autowired
    GroupService groupService;

    @GetMapping("/group/list")
    public List<Group> getGroupList(){
        return groupService.getGroupList();
    }

    @PostMapping("/group/modifyName/{index}")
    public ResponseEntity modifyGroupName(@PathVariable int index, @RequestBody Group group){
        return groupService.modifyGroupName(index,group);
    }
}
