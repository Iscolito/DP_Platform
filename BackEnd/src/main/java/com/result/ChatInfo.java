package com.result;

import java.util.ArrayList;

public class ChatInfo {
	ArrayList<String> username;
	ArrayList<String> time;
	ArrayList<String> text;
	ArrayList<String> num;
	
	public ChatInfo(ArrayList<ArrayList<String>> data) {
		this.username=data.get(0);
		this.time=data.get(1);
		this.text=data.get(2);
		this.num=data.get(3);
	}
	
	public ChatInfo(ArrayList<ArrayList<String>> data, boolean chat) {
		this.num=data.get(0);
		this.username=data.get(1);
		this.time=data.get(2);
		this.text=data.get(3);

	}
	
    public ArrayList<String> getUsername() {
        System.out.println(username);
        return username;
    }

    public void setUsername(ArrayList<String> username) {
        this.username = username;
    }
    
    public ArrayList<String> getTime() {
        System.out.println(time);
        return time;
    }

    public void setTime(ArrayList<String> time) {
        this.time = time;
    }
    
    public ArrayList<String> getText() {
        System.out.println(text);
        return text;
    }

    public void setText(ArrayList<String> text) {
        this.text = text;
    }
    
    public ArrayList<String> getNum() {
        System.out.println(num);
        return num;
    }

    public void setNum(ArrayList<String> num) {
        this.num = num;
    }
    
    
}
