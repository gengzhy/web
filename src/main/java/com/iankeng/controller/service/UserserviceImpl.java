package com.iankeng.controller.service;

import com.iankeng.controller.entity.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author Ian
 * @date 2019/8/17 16:35
 */
@Service
public class UserserviceImpl implements UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public UserVO getUser(String id) {
        String sql = "select id, name, code from user where id=?";
        Object[] args = new Object[]{id};
        List<Map<String, Object>> ls = jdbcTemplate.queryForList(sql, args);
        if (ls != null && ls.size() > 0){
            Map<String, Object> map = ls.get(0);
            UserVO vo = new UserVO();
            vo.setId(map.get("id").toString());
            vo.setCode(map.get("code").toString());
            vo.setName(map.get("name").toString());
            return vo;
        }
        return null;
    }
}
