package com.wxx.sb.conrtoller;


import com.wxx.sb.common.CommonUtil;
import com.wxx.sb.domain.Student;
import com.wxx.sb.domain.StudentXo;
import com.wxx.sb.service.StudentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author weixx
 * @date 2019年1月1日 14:11:41
 */
@RestController
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "studentXo", value = "学习信息", required = true, dataType = "StudentXo", paramType = "body")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Integer addUser(@RequestBody StudentXo studentXo, HttpServletRequest request, HttpServletResponse httpServletResponse) {
        Map<String, Object> map = CommonUtil.getParameterMap(request);
        Integer integer = studentService.addStudent(CommonUtil.convertUser(studentXo));
        return integer;
    }
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public String deleteUser(@RequestBody StudentXo studentXo, HttpServletRequest request, HttpServletResponse httpServletResponse) {
        Map<String, String> map = new HashMap<>();
        List<Student> students = studentService.queryStudentList(map);
        return "";
    }
    @ApiOperation(value="获取用户详细信息", notes="根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/modify", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public String modifyUser(@RequestBody StudentXo studentXo, HttpServletRequest request, HttpServletResponse httpServletResponse) {
        Map<String, String> map = new HashMap<>();
        List<Student> students = studentService.queryStudentList(map);
        return "";
    }
    @ApiIgnore//使用该注解忽略这个API
    public String queryUser(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        Map<String, String> map = new HashMap<>();
        List<Student> students = studentService.queryStudentList(map);
        return "";
    }


}