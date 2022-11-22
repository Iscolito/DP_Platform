package com.controller;

import com.result.Result;
import com.back.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.HtmlUtils;
import java.util.ArrayList;
import com.mysql.LinkSql;

@Controller
public class RegistController {
	@CrossOrigin
	@PostMapping(value = "api/regist")
	@ResponseBody
	 public Result regist(@RequestBody User requestUser) {
		LinkSql users=new LinkSql("192.168.0.100", "yysy");
		int num=users.findNum("num");
		users.addNum("num", num+1);
		ArrayList<String> index=users.showIndex("user");
		ArrayList<String> data=new ArrayList<>();
		this.process(Integer.toString(num),data);
        this.process(requestUser.getPassword(),data);
        this.process(requestUser.getName(),data);
        this.process(requestUser.getSex(),data);
        this.process(requestUser.getAge(),data);
        this.process(requestUser.getMail(),data);
        this.process(requestUser.getTel(),data);
        this.process(requestUser.getInfo(),data);
        users.addrow("user",index , data);
        return new Result(num);
	}
	public void process(String raw, ArrayList<String> data) {
		String res = raw;
        res = HtmlUtils.htmlEscape(res);
        res = "\""+res+"\"";
        data.add(res);
	}
}
