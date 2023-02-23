package cn.lacknb.dynamicdatasourcesample.controller;

import cn.lacknb.dynamicdatasourcesample.entity.Person;
import cn.lacknb.dynamicdatasourcesample.entity.User;
import cn.lacknb.dynamicdatasourcesample.mapper.mysql.UserMapper;
import cn.lacknb.dynamicdatasourcesample.service.PersonService;
import cn.lacknb.dynamicdatasourcesample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <h2>  </h2>
 *
 * @description:
 * @menu
 * @author: nbh
 * @description:
 * @date: 2023/2/23 14:46
 **/
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private UserService userService;

    @Autowired
    private PersonService personService;

    @RequestMapping("/user/list")
    public List<User> users() {
        return userService.lambdaQuery().last("limit 10").list();
    }

    @RequestMapping("/person/list")
    public List<Person> personList() {
        return personService.lambdaQuery().last("limit 10").list();
    }

}
