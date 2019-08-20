package com.demo.work;

import java.text.ParseException;
import java.util.Calendar;

/**
 * @ClassName Clock
 * @Description TODO
 * @Author Hzrobo
 * @CreateDate 2019年08月17日  15:55:49
 * @Version 1.0.0
 */

public class Clock {
    private static String inputAlarmClockTime = "22:15";
    private static int interval;
    private static int hour;
    private static int min;

    /**
     * 输出系统的时间
     */
    private class SetTime extends Thread {
        /**
         * 重写运行方法
         */
        @Override
        public void run() {
            while (true) {
                try {
                    SetTime.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(nowTime());
            }
        }
    }

    /**
     * 闹钟响
     */
    private class AlamRinging extends Thread {
        private Thread thread;

        public AlamRinging(Thread thread) {
            this.thread = thread;
        }


        @Override
        public void run() {
            while (true) {
                try {
                    if (!calculteTime()) {
                        System.out.println("嘀嘀嘀嘀嘀嘀");
                        thread.join(8000);
                        calculteTime();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

        }


    }

    /**
     * 获得系统的当前时间
     *
     * @return
     */
    public static String nowTime() {
        Calendar cal = Calendar.getInstance();
        hour = cal.get(Calendar.HOUR_OF_DAY);
        min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        String now = new String(hour + ":" + min + ":" + sec);
        return now;
    }

    /**
     * 设定闹钟时间与系统时间相比较
     *
     * @return
     * @throws ParseException
     */
    public static boolean calculteTime() throws ParseException {

        int myHour = Integer.parseInt(inputAlarmClockTime.substring(0, 2));
        int myMin = Integer.parseInt(inputAlarmClockTime.substring(3));

        if (myHour == hour) {
            if (interval == myMin) {
                return false;
            }
            if (myMin == min ) {
                interval = myMin + 1;
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        Clock ac = new Clock();
        Thread setSysteamTime = ac.new SetTime();
        Thread aramClockTime = ac.new AlamRinging(setSysteamTime);
        setSysteamTime.start();
        aramClockTime.start();

    }

}
