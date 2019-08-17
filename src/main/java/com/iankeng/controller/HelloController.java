package com.iankeng.controller;
import com.iankeng.controller.entity.UserVO;
import com.iankeng.controller.service.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author Ian
 * @date 2019/8/17 14:50
 */
@Controller
public class HelloController {

    private final static Log log = LogFactory.getLog(HelloController.class);

    @Autowired
    private UserService UserService;

    @RequestMapping(value = "/hello")
    @ResponseBody
    public String hello() {
        return "hello world";
    }

    @RequestMapping("/getInfo")
    public String getInfo(Map<String, Object> map) {
        map.put("code", "IK001");
        map.put("name", "Ian Keng");
        map.put("tel", "156-8517-5799");
//        log.info(map);
        return "index";
    }

    @RequestMapping("/getUser")
    public String getUserInfo(Map<String, UserVO> map){
        UserVO vo = UserService.getUser("IK1001");
        map.put("user", vo);
        return "user";
    }
}