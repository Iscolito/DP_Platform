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
public class ChatController {
	@CrossOrigin
	@PostMapping(value = "api/singleget")
	@ResponseBody
	 public ChatInfo getChat(@RequestBody codes code) {
		System.out.println(code.Infocode);
		System.out.println("被调用");
		LinkSql users=new LinkSql("192.168.0.100", "yysychat");
		ArrayList<ArrayList<String>> res=users.findId("chatlist","num",code.getInfocode());
		return new ChatInfo(res);
	}
	
	@CrossOrigin
	@PostMapping(value = "api/replyget")
	@ResponseBody
	 public ChatInfo getReply(@RequestBody codes code) {
		String tablename="chat"+code.Infocode;
		System.out.println(code.Infocode);
		System.out.println("被调用");
		LinkSql users=new LinkSql("192.168.0.100", "yysychat");
		ArrayList<ArrayList<String>> res=users.search(tablename);
		return new ChatInfo(res,true);
	}
	
	@CrossOrigin
	@PostMapping(value = "api/replydel")
	@ResponseBody
	 public Result delReply(@RequestBody codes code) {
		LinkSql users=new LinkSql("192.168.0.100", "yysychat");
		users.deleterow("chat"+code.Gcode, "id", code.Infocode);
		return new Result(130);
	}
	
	@CrossOrigin
	@PostMapping(value = "api/singlesubmit")
	@ResponseBody
	 public Result submit(@RequestBody ChatList requestUser) {
		LinkSql users=new LinkSql("192.168.0.100", "yysychat");
		String tablename="chat"+Integer.toString(requestUser.num);
		ArrayList<String> index=users.showIndex(tablename);
		index.remove("id");
		System.out.println(index);
		ArrayList<String> data=new ArrayList<>();
        this.process(requestUser.getUsername(),data);
        this.process(requestUser.getTime(),data);
        this.process(requestUser.getText(),data);
        users.addrow(tablename,index , data);
        return new Result(120);
	}
	public void process(String raw, ArrayList<String> data) {
		String res = raw;
        res = HtmlUtils.htmlEscape(res);
        res = "\""+res+"\"";
        data.add(res);
	}
}
