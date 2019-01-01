package com.wxx.sb.service.Impl;


import com.wxx.sb.domain.Student;
import com.wxx.sb.mapper.StudentMapper;
import com.wxx.sb.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author abel
 * @ClassName UserServiceImpl
 * @date 2018年12月18日 00:37:11
 */
@Service("StudentService")
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentMapper studentMapper;


    @Override
    public Integer addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public Integer deleteStudent(Student student) {
        return studentMapper.deleteByStudent(student);
    }

    @Override
    public Integer updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public List<Student> queryStudentList(Map<String, String> params) {
        return studentMapper.queryStudentByMap(params);
    }
}