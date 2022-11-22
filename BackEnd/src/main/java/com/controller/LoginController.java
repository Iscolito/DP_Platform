package com.controller;

import com.result.Result;
import com.back.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;

import java.util.ArrayList;
import java.util.Objects;
import com.mysql.LinkSql;

@Controller
public class LoginController {
    @CrossOrigin
    @PostMapping(value = "api/login")
    @ResponseBody
    public Result login(@RequestBody User requestUser) {
    // 对html标签进行转义，防止 XSS 攻击
        String username = requestUser.getUsername();
        username = HtmlUtils.htmlEscape(username);
        LinkSql users=new LinkSql("192.168.0.100", "yysy");
        ArrayList<ArrayList<String>> info=users.findId("user","id",username);
        if (!Objects.equals(info.get(0).get(0), username) || !Objects.equals(info.get(1).get(0), requestUser.getPassword())) {
            String message = "账号密码错误";
            System.out.println(message);
            return new Result(400);
        } else {
            System.out.println(info.get(2).get(0));
            return new Result(200, info.get(2).get(0));

        }
    }
}
