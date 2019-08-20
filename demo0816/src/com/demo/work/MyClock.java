package com.demo.work;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName MyClock
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月19日  21:29:55
 * @Version 1.0.0
 */

public class MyClock extends Thread{
    private  String time;//闹钟时间
    private Timestamp applyDate;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    //创建闹钟方法
    public MyClock(String time){

        try {
            this.time = time;
            //获得当前时间对象
            Date nowDate = new Date(System.currentTimeMillis());
            String strDate = nowDate.toString();
            //System.out.println(strDate);
            //获取设置的时间
            applyDate = new Timestamp(dateFormat.parse(strDate +" "+time).getTime());
            System.out.println(applyDate);
            if (applyDate.before(nowDate)){
                applyDate = new Timestamp(applyDate.getTime()+24*60*60*1000);
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }


    }
    //添加定时器
    public void addTimer(Timer timer){
        timer.schedule(new TimerTask() {
            int count = 0;
            @Override
            public void run() {
                System.out.println("滴里里滴里搭拉");
                count++;
                if (count>=5){
                    this.cancel();
                    applyDate = new Timestamp(System.currentTimeMillis()+10000);
                    addTimer(timer);
                }


            }
        },applyDate,2000);
    }

    @Override
    public void run(){
        Timer timer = new Timer();
        addTimer(timer);
    }


    public static void main(String[] args) {

        MyClock m = new MyClock("22:04:00");
        m.start();

    }

}
