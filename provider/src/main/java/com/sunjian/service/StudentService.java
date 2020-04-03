package com.sunjian.service;

import com.sunjian.entity.Student;

import java.util.Collection;

/**
 * @author sunjian
 * @date 2020/4/3 8:50
 */
public interface StudentService {
    public Collection<Student> findAll();
    public Student findById(Long id);
    public void saveOrUpdate(Student student);
    public void deleteById(Long id);
}
