package com.back;

public class User {
    String username;
    String password;
    String name;
    String sex;
    String age;
    String mail;
    String tel;
    String info;


    public String getUsername() {
        System.out.println(username);
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getName() {
        System.out.println(name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getSex() {
    	System.out.println(sex);
    	return sex;
    }
    
    public void setSex(String sex) {
    	this.sex=sex;
    }
    
    public String getAge() {
    	System.out.println(age);
    	return age;
    }
    
    public void setAge(String age) {
    	this.age=age;
    }
    
    public String getMail() {
    	System.out.println(mail);
    	return mail;
    }
    
    public void setMail(String mail) {
    	this.mail=mail;
    }
    
    public String getTel() {
    	System.out.println(tel);
    	return tel;
    }
    
    public void setTel(String tel) {
    	this.tel=tel;
    }
    
    public String getInfo() {
    	System.out.println(info);
    	return info;
    }
    
    public void setInfo(String info) {
    	this.info=info;
    }
    

}

