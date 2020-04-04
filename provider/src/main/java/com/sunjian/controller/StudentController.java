package com.sunjian.controller;

import com.sunjian.entity.Student;
import com.sunjian.feignService.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author sunjian
 * @date 2020/4/3 8:57
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return studentService.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id){
        return studentService.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") Long id){
        studentService.deleteById(id);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student){
        studentService.saveOrUpdate(student);
    }

    @GetMapping("/index")
    public String index(){
        return "provider " + this.port;
    }
}
