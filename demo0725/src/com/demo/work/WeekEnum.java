package com.demo.work;

/**
 * @ClassName WeekEnum
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年07月25日  19:53:14
 * @Version 1.0.0
 */

public class WeekEnum {
    enum Weeks{
        MONDAY("星期一"),
        TUESDAY("星期二"),
        WEDNESDAY("星期三"),
        THURSDAY("星期四"),
        FRIDAY("星期五"),
        SATURDAY("星期六"),
        SUNDAY("星期日" );

        private String value;

        Weeks(String value){
            this.value = value;

        }
        public String getValue(){
            return value;
        }
    }
    public String getWeeks(Weeks weeks){
        String result = null;
        switch (weeks){
            case MONDAY:
                result = weeks.value;
                break;
            case TUESDAY:
                result = weeks.value;
                break;
            case WEDNESDAY:
                result = weeks.value;
                break;
            case THURSDAY:
                result = weeks.value;
                break;
            case FRIDAY:
                result = weeks.value;
                break;
            case SATURDAY:
                result = weeks.value;
                break;
            case SUNDAY:
                result = weeks.value;
                break;
        }
        return result;
    }

    public void printMsg(){
        // Weeks[]  arr = Weeks.values();
        //  WeekEnum we = new WeekEnum();
        for(Weeks arr :Weeks.values()){
            System.out.println("name:"+arr+"   value: "+arr.value);
        }
    }
    public  static void main(String[] args){
        WeekEnum we = new WeekEnum();
        we.printMsg();

    }

}
