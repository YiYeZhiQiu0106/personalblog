package zuohonglin.club.personalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zuohonglin.club.personalblog.entity.User;
import zuohonglin.club.personalblog.service.UserServiceI;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserServiceI userServiceImpl;

    @RequestMapping(value = "/getAllUser")
    public String getAllUser(){
      List<User> list = userServiceImpl.getAllUser();
        System.out.println(list.get(0).toString());
        System.out.println("cccc");
        return "11";
    }
}
