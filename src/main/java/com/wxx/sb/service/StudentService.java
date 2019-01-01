package com.wxx.sb.service;

import com.wxx.sb.domain.Student;

import java.util.List;
import java.util.Map;

/**
 * The Interface StudentService.
 */
public interface StudentService {

    /**
     * 新增用户
     *
     * @param student
     * @return
     */
    public Integer addStudent(Student student);


    /**
     * 删除用户
     *
     * @param student
     * @return
     */
    public Integer deleteStudent(Student student);


    /**
     * 更新用户
     *
     * @param student
     * @return
     */
    public Integer updateStudent(Student student);


    /**
     * 查询用户列表
     *
     * @param params
     * @return
     */
    public List<Student> queryStudentList(Map<String, String> params);

}