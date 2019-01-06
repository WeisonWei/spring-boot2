package com.wxx.sb.conrtoller;


import com.wxx.sb.common.CommonUtil;
import com.wxx.sb.domain.Student;
import com.wxx.sb.domain.StudentXo;
import com.wxx.sb.util.RedisUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author weixx
 * @date 2019年1月6日07:36:10
 */
@RestController
@RequestMapping(value = "/redis")
public class RedisController {


    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "studentXo", value = "学习信息", required = true, dataType = "StudentXo", paramType = "body")
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Integer redisAdd(@RequestBody StudentXo studentXo, HttpServletRequest request, HttpServletResponse httpServletResponse) {
        RedisUtil redisUtil = new RedisUtil();
        /**string**/
        redisUtil.set("age", 15);
        //设置key为name,value为lpl,10为时间（秒）
        redisUtil.set("name", "lpl", 10);
        System.out.println(redisUtil.get("age"));
        System.out.println("姓名：" + redisUtil.get("name"));
        //年龄增加1
        redisUtil.incr("age", 1);
        System.out.println("年龄增加后" + redisUtil.get("age"));
        //年龄减去1
        redisUtil.decr("age", 1);
        System.out.println("年龄减去后" + redisUtil.get("age"));
        /****map****/
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("name", "张三");
        userMap.put("age", 16);
        redisUtil.hmset("user", userMap);
        System.out.println(redisUtil.hmget("user"));

        return 1;
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/delete", method = RequestMethod.DELETE, produces = "application/json;charset=UTF-8")
    public String redisDelete(@RequestBody StudentXo studentXo, HttpServletRequest request, HttpServletResponse httpServletResponse) {
        Map<String, String> map = new HashMap<>();

        return "";
    }

    @ApiOperation(value = "获取用户详细信息", notes = "根据url的id来获取用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @RequestMapping(value = "/modify", method = RequestMethod.PUT, produces = "application/json;charset=UTF-8")
    public String redisUpdate(@RequestBody StudentXo studentXo, HttpServletRequest request, HttpServletResponse httpServletResponse) {
        Map<String, String> map = new HashMap<>();

        return "";
    }

    @ApiIgnore
    //使用该注解忽略这个API
    public String redisQuert(HttpServletRequest request, HttpServletResponse httpServletResponse) {
        Map<String, String> map = new HashMap<>();

        return "";
    }


}