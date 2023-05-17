package com.itpw.day15.thread.d_supplement;

import com.itpw.day02.对象和引用.复杂引用分析.T;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
    定时器 java.util.Timer

    在实际开发中,目前使用较多的是Spring框架中提供的SpringTask框架,但是仍有必要学习
    JDK原生的java.util.Timer，因为SpringTask就是用的这个实现
*/
public class TimerThread {
    public static void main(String[] args) throws ParseException {
        Timer timer = new Timer();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        Date firstTime = sdf.parse(format);
        // timer.schedule(定时任务,第一次执行时间,间隔多久执行一次)
        timer.schedule(new LogTimerTask(),firstTime,1000*5);
    }
}

class LogTimerTask extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        System.out.println(format + ":完成了一次数据备份!");
    }
}
