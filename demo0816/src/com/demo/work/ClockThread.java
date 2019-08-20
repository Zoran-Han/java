package com.demo.work;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName ClockThread
 * 闹钟程序
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月19日  10:11:06
 * @Version 1.0.0
 */

public class ClockThread extends Thread {

    private String time;//闹钟时间
    private Timestamp applyDate;//
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public ClockThread(String time) {

        try {
            this.time = time;
            //获得当前的时间对象
            Date currentDate = new Date(System.currentTimeMillis());
            //获得当前时间的年月日
            String strcurrentStrDate = currentDate.toString();
            //获得设置的时间
            applyDate  = new Timestamp(dateFormat.parse(strcurrentStrDate+" "+time).getTime());
            //System.out.println(applyDate);
            //比较设置时间是否先于当前时间
            if (applyDate.before(currentDate)){
                applyDate = new Timestamp(applyDate.getTime()+24*60*60*1000);
            }

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    /**
     * 添加定时器
     * @param timer
     */
    public void addTimertask(Timer timer){
        //给定时器创建任务
        timer.schedule(new TimerTask() {
            //定义变量记录响的次数
            int count = 0;
            @Override
            public void run() {
                System.out.println("该起床了！");
                count++;
                if (count>=3){
                    //取消当前定时器任务
                    this.cancel();
                    //修改闹钟下次响的时间
                    applyDate = new Timestamp(System.currentTimeMillis()+10000);
                    //再次添加定时器
                    addTimertask(timer);
                }
            }
        },applyDate,2000);
    }


    @Override
    public void run(){

        //定时器，创建定时器对象
        Timer timer = new Timer();
        //访问添加定时器的方法
        addTimertask(timer);

    }

    public static void main(String[] args) {
        ClockThread t1 = new ClockThread("11:14:50");
        t1.start();

    }

}
