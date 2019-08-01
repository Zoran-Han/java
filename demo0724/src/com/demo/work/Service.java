package com.demo.work;

import javax.jws.soap.SOAPBinding;

/**
 * @ClassName Service
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月24日  20:12:42
 * @Version 1.0.0
 */

  public class Service {
     //定义数组
      public  User[] users ;

      public  Service(){
          this.users = new User[5];
          this.users[0] = new User("小明","123852456","159357@163.com");
          this.users[1] = new Member("小张","198566","859632@163.com","男",
                  "15056967412", "重庆市",99);
          this.users[2] = new SeniorMember("马云","123456","ailibaba@163.com","男",
                  "15055556666", "杭州市",9999999,"每天送一个冰镇西瓜");
          this.users[3] = new User("韩红","85962326","9632544.com");
          this.users[4] = new Member("敏敏","654321","796463.com","女",
                  "1596325812", "重庆市南岸区",103);
      }

    /**
     * 查找用户
     * @param key
     * @param password
     * @return
     */

      public User  findUser(String key,String password ){
          //根据用户名查找
          for (User user : users){
              if(key.equals(user.getName())&&password.equals(user.getPassword())){
                  return user;
              }
          }
          //根据邮箱+密码查找
          for (User user : users){
              if (key.equals(user.getEmail())&&password.equals(user.getPassword())){
                  return user;
              }
          }

          //根据手机号+密码查找
          for (User user : users){
              if (user instanceof  Member){
                  Member member = (Member) user;
                  if (key.equals(member.getPhoneNumber())&&password.equals(member.getPassword())){
                      return user;
                  }
              }
          }
           return  null;
      }


    /**
     * 创建方法来判断是不是高级会员
     * @param user
     */
    public  void JudgeSeniorMember(User user){
        if (user instanceof SeniorMember) {
            //上下转型类之间的类型必须要有is-a(继承、实现)关系，
            SeniorMember seniorMember = (SeniorMember) user;
            System.out.println(seniorMember.getName()+"["+seniorMember.getGender()+"]"+
                    " 特权："+seniorMember.getPrivilege());

            /*System.out.println(user.getName()+"["+((SeniorMember) user).getGender()+"]"
                    +  " 特权："+((SeniorMember) user).getPrivilege());*/

        }else{
            System.out.println("用户: "+user.getName()+"不是高级会员，请充值");
        }

    }

    public static void main(String[] args){
        User user = new User("小明","123852456","159357@163.com");
        User member= new Member("小张","198566","859632@163.com","男",
                "15056967412", "重庆市",99);
        User seniorMember = new SeniorMember("马云","123456","ailibaba@163.com","男",
                "15055556666", "杭州市",9999999,"每天送一个冰镇西瓜");

        user.printMsg();
        member.printMsg();
        seniorMember.printMsg();
        Service service = new Service();
        //使用instanceof比较对象是否属于某个类时，若判断比较多个类，且类之间存在继承关系，最好：先比较子类，再比较父类
//        System.out.println(user instanceof  User);
//        System.out.println(member instanceof  User);
//        System.out.println(member instanceof  User);
        //判断用户是不是高级会员
        service.JudgeSeniorMember(user);
        service.JudgeSeniorMember(member);
        service.JudgeSeniorMember(seniorMember);
        System.out.println("-----------查找用户-----------");

        //查找用户
        User user1 = service.findUser("马云","123456");
         user1.printMsg();
        User user2 = service.findUser("796463.com","654321");
        user2.printMsg();
        User user3 = service.findUser("15056967412","198566");
        user3.printMsg();

    }

  }
