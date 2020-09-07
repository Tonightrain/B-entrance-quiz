package com.thoughtworks.capability.gtb.entrancequiz.api;
import com.thoughtworks.capability.gtb.entrancequiz.dto.Student;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    public List<Student> studentList = initStudents();

    private List<Student> initStudents() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("1","沈乐棋"));
        list.add(new Student("2","徐慧慧"));
        list.add(new Student("3","陈思聪"));
        list.add(new Student("4","王江林"));
        list.add(new Student("5","王登宇"));
        list.add(new Student("6","杨思雨"));
        list.add(new Student("7","江雨舟"));
        list.add(new Student("8","廖燊"));
        list.add(new Student("9","胡晓"));
        list.add(new Student("10","但杰"));
        list.add(new Student("11","盖迈达"));
        list.add(new Student("12","肖美琦"));
        list.add(new Student("13","黄云洁"));
        list.add(new Student("14","齐瑾浩"));
        list.add(new Student("15","刘亮亮"));
        list.add(new Student("16","肖逸凡"));
        list.add(new Student("17","王作文"));
        list.add(new Student("18","郭瑞凌"));
        list.add(new Student("19","李明豪"));
        list.add(new Student("20","党泽"));
        list.add(new Student("21","肖伊佐"));
        list.add(new Student("22","贠晨曦"));
        list.add(new Student("23","李康宁"));
        list.add(new Student("24","马庆"));
        list.add(new Student("25","商婕"));
        list.add(new Student("26","余榕"));
        list.add(new Student("27","谌哲"));
        list.add(new Student("28","董翔锐"));
        list.add(new Student("29","陈泰宇"));
        list.add(new Student("30","赵允齐"));
        list.add(new Student("31","张柯"));
        list.add(new Student("32","廖文强"));
        list.add(new Student("33","刘轲"));
        list.add(new Student("34","廖浚斌"));
        list.add(new Student("35","凌凤仪"));
        return list;
    }




}
