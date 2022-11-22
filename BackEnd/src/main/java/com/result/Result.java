package com.result;

public class Result {
    //响应码
    private int code;
    String name;

    public Result(int code, String name) {
        this.code = code;
        this.name = name;
    }
    
    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
