package chapter.fifth.timerTest2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by songxiaowei on 2016/3/12.
 */
public class Run {
    private static Timer timer = new Timer(true);
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("运行了！时间为：" + new Date());
        }
    }

    public static void main(String[] args) {
        try{
            MyTask task = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dateString = "2016-3-12 21:44:00";
            Date dateRef = sdf.parse(dateString);
            System.out.println("字符串时间:" + dateRef.toLocaleString() + " 当前时间: " + new Date().toLocaleString());
            timer.schedule(task, dateRef);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
