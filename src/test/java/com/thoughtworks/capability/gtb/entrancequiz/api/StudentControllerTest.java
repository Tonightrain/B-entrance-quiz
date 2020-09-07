package com.thoughtworks.capability.gtb.entrancequiz.api;

import com.thoughtworks.capability.gtb.entrancequiz.service.GroupService;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class StudentControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    StudentController studentController;

    @Autowired
    StudentService studentService;

    @Test
    void shouldGetStudentsListSuccess() throws Exception{
        mockMvc.perform(get("/student/list"))
                .andExpect(jsonPath("$[0].name",is("沈乐棋")))
                .andExpect(jsonPath("$[1].name",is("徐慧慧")))
                .andExpect(status().isOk());
    }

    @Test
    void shouldAddOneStudentSuccess() throws Exception{
        String requestJson = "{\"id\":\"36\", \"name\":\"小明\"}";
        mockMvc.perform(post("/student/add").content(requestJson).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
        mockMvc.perform(get("/student/list"))
                .andExpect(jsonPath("$[35].name",is("小明")))
                .andExpect(status().isOk());
    }
}