package com.wxx.sb.mapper;


import com.wxx.sb.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface StudentMapper {
    //新增学生信息
    public Integer addStudent(Student student);
    //查询所有同学信息
    public Integer deleteByStudent(Student student);
    //查询所有同学信息
    public Integer deleteByString(String studentName);
    //查询所有同学信息
    public Integer updateStudent(Student student);
    //查询所有同学信息
    public List<Student> queryStudents();
    //根据Map条件查询所有同学
    public List<Student> queryStudentByMap(Map<String, String> params);
    //根据String条件查询所有同学
    public List<Student> queryStudentByParams(String studentPhone, String studentName);

    //查询所有同学的所有科目成绩
    public List<Student> queryStudentScores();
    //根据条件查询所有同学的所有科目成绩
    public List<Student> queryStudentScores1(String studentName, String studentPhone);
    //根据条件查询所有同学的所有科目成绩
    public List<Student> queryStudentScores2(String studentName, String studentPhone);

}
