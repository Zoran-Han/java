package com.demo.work;

/**
 * @ClassName SeniorMember
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  20:12:14
 * @Version 1.0.0
 */

public class SeniorMember  extends Member {
    private String privilege; //特权

    public String getPrivilege() {
        return privilege;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }
    //构造方法
    public SeniorMember(){

    }

    public SeniorMember(String name,String password,String email,String  gender,String  phoneNumber,
                        String  address,double  balance,String privilege){
        super(name,password,email,gender,phoneNumber,address,balance);
        this.privilege = privilege;
    }

    @Override
    public void printMsg(){

        System.out.println("用户名："+getName()+" 密码："+password+" 邮箱："+email +" 性别： "+getGender()
                           + " 电话号码："+getPhoneNumber()+" 地址："+getAddress()+ " 余额："+getBalance()
                          +" 特权："+getPrivilege());
        /*super.printMsg();
        System.out.println("  " +privilege );*/

    }


}
