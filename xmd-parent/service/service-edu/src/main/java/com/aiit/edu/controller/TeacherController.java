package com.aiit.edu.controller;


import com.aiit.edu.entity.Teacher;
import com.aiit.edu.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author xmd
 * @since 2020-09-13
 */
@RestController
@RequestMapping("/edu/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @GetMapping("findAll")
    public List<Teacher> findAll(){
        List<Teacher> list = teacherService.list(null);
        return list;
    }

    @DeleteMapping("{id}")
    public boolean deleteTeacherById(@PathVariable String id){
        return teacherService.removeById(id);
    }
}

