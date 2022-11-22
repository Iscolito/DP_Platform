package com.result;
import java.util.ArrayList;
public class UserInfo {
	ArrayList<String> username;
	ArrayList<String> password;
	ArrayList<String> name;
	ArrayList<String> sex;
	ArrayList<String> age;
	ArrayList<String> mail;
	ArrayList<String> tel;
	ArrayList<String> info;

    public UserInfo(ArrayList<ArrayList<String>> data) {
    	this.username=data.get(0);
    	this.password=data.get(1);
    	this.name=data.get(2);
    	this.sex=data.get(3);
    	this.age=data.get(4);
    	this.mail=data.get(5);
    	this.tel=data.get(6);
    	this.info=data.get(7);
    }
    
    public ArrayList<String> getUsername() {
        return username;
    }

    public void setUsername(ArrayList<String> username) {
        this.username = username;
    }

    public ArrayList<String> getPassword() {
        return password;
    }

    public void setPassword(ArrayList<String> password) {
        this.password = password;
    }
    
    public ArrayList<String> getName() {
        return name;
    }

    public void setName(ArrayList<String> name) {
        this.name = name;
    }
    
    public ArrayList<String> getSex() {
    	return sex;
    }
    
    public void setSex(ArrayList<String> sex) {
    	this.sex=sex;
    }
    
    public ArrayList<String> getAge() {
    	return age;
    }
    
    public void setAge(ArrayList<String> age) {
    	this.age=age;
    }
    
    public ArrayList<String> getMail() {
    	return mail;
    }
    
    public void setMail(ArrayList<String> mail) {
    	this.mail=mail;
    }
    
    public ArrayList<String> getTel() {
    	return tel;
    }
    
    public void setTel(ArrayList<String> tel) {
    	this.tel=tel;
    }
    
    public ArrayList<String> getInfo() {
    	return info;
    }
    
    public void setInfo(ArrayList<String> info) {
    	this.info=info;
    }
}
