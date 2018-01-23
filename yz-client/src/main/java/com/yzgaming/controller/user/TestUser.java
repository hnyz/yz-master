package com.yzgaming.controller.user;

import java.io.Serializable;

public class TestUser implements Serializable {

    private int id;
    private int code;
    private int name;

    public TestUser(int id, int code, int name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
