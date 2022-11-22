package com.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.HtmlUtils;

import com.back.ChatList;
import com.mysql.LinkSql;
import com.result.ChatInfo;
import com.back.codes;
import com.result.Result;

@Controller
public class ChatlistController {
	@CrossOrigin
	@PostMapping(value = "api/chatsubmit")
	@ResponseBody
	 public Result submit(@RequestBody ChatList requestUser) {
		LinkSql users=new LinkSql("192.168.0.100", "yysychat");
		int num=users.findNum("num");
		users.addNum("num", num+1);
		ArrayList<String> index=users.showIndex("chatlist");
		ArrayList<String> data=new ArrayList<>();
        this.process(requestUser.getUsername(),data);
        this.process(requestUser.getTime(),data);
        this.process(requestUser.getText(),data);
		this.process(Integer.toString(num),data);
        users.addrow("chatlist",index , data);
        String tableset="(id INT(10) PRIMARY KEY AUTO_INCREMENT, username VARCHAR(20),text VARCHAR(100),time VARCHAR(20))";
        users.addtable("chat"+Integer.toString(num),tableset);
        return new Result(num);
	}
	public void process(String raw, ArrayList<String> data) {
		String res = raw;
        res = HtmlUtils.htmlEscape(res);
        res = "\""+res+"\"";
        data.add(res);
	}
	
	@CrossOrigin
	@PostMapping(value = "api/chatget")
	@ResponseBody
	 public ChatInfo getChat(@RequestBody codes code) {
		LinkSql users=new LinkSql("192.168.0.100", "yysychat");
		ArrayList<ArrayList<String>> res=users.search("chatlist");
		return new ChatInfo(res);
	}
	
	@CrossOrigin
	@PostMapping(value = "api/chatdel")
	@ResponseBody
	 public Result delChat(@RequestBody codes code) {
		LinkSql users=new LinkSql("192.168.0.100", "yysychat");
		users.deleterow("chatlist", "num", code.Infocode);
		users.deltable("chat"+code.Infocode);
		return new Result(130);
	}
}
