package com.iankeng.controller.entity;

import java.io.Serializable;

/**
 * @author Ian
 * @date 2019/8/17 16:26
 */
public class UserVO implements Serializable {
    private static final long serialVersionUID = -99111099373268592L;
    private String id;
    private String name;
    private String code;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
}
