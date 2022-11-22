package com.back;

public class ChatList {
	String username;
	String time;
	String text;
	public int num;
	
    public String getUsername() {
        System.out.println(username);
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getTime() {
        System.out.println(time);
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public String getText() {
        System.out.println(text);
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public int getNum() {
        System.out.println(num);
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
}
