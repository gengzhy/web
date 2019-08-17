package com.iankeng.jpa.controller;

import com.iankeng.jpa.data.JpaUser;
import com.iankeng.jpa.service.JpaUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Map;
import java.util.Timer;

/**
 * @author Ian
 * @date 2019/8/17 17:49
 */
@Controller
public class JpaUserController {

    @Autowired
    private JpaUserRepository jpaUserRepository;

    @RequestMapping("/add-user")
    public String jpaUser(Map<String, Object> map) {
        JpaUser user = new JpaUser();
        user.setCode("ian");
        user.setName("伊恩");
        user.setPassword("1111");
        user = jpaUserRepository.save(user);
        map.put("user", user);
        return "jpa-user";
    }

    @RequestMapping("/update-user/{id}")
    public String jpaUserUpdate(Map<String, Object> map, @PathVariable("id") Integer id) {
        JpaUser user = new JpaUser();
        user.setId(id);
        user.setCode("ian");
        user.setName("伊恩2");
        user.setPassword("11112666");
        user = jpaUserRepository.save(user);
        map.put("user", user);
        map.put("ts", LocalDate.now() + " " + LocalTime.now());
        return "jpa-user-update";
    }
}
