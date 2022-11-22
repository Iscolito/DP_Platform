package com.controller;
import com.result.UserInfo;
import com.back.codes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import com.mysql.LinkSql;

@Controller
public class UserController {
    @CrossOrigin
    @PostMapping(value = "api/user")
    @ResponseBody
    public UserInfo getInfo(@RequestBody codes code) {
    	LinkSql users=new LinkSql("192.168.0.100", "yysy");
    	ArrayList<ArrayList<String>> res=users.search("user");
    	return new UserInfo(res);
    }
}
