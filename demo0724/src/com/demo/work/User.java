package com.demo.work;

/**
 * @ClassName User
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  20:11:18
 * @Version 1.0.0
 */
//对属性进行封装
public class User {
    private String name; //姓名
    protected String password; //密码
    protected String email; // 邮件

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * 输出基本信息
     */
    public void printMsg(){
        System.out.println("用户名： "+name+" 密码："+password+" 邮箱："+email);

    }

    public User(){

    }

    public  User(String name,String password,String email){
        this.name = name;
        this.password = password;
        this.email = email;

    }


}
