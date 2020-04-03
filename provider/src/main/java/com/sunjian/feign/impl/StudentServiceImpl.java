package com.sunjian.feign.impl;

import com.sunjian.entity.Student;
import com.sunjian.feign.StudentService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunjian
 * @date 2020/4/3 8:52
 */
@Service
public class StudentServiceImpl implements StudentService {
    private Map<Long, Student> studentMap;
    public StudentServiceImpl(){
        studentMap = new HashMap<>();
        studentMap.put(1L, new Student(1L, "孙健", 32));
        studentMap.put(2L, new Student(2L, "C罗", 33));
        studentMap.put(3L, new Student(3L, "梅西", 32));
    }


    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
