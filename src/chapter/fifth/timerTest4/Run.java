package chapter.fifth.timerTest4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by songxiaowei on 2016/3/13.
 */
public class Run {
    static int i = 0;
    static public class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("正常执行了" + i);
        }
    }

    public static void main(String[] args) {
        while (true){
            try{
                i++;
                Timer timer = new Timer();
                MyTask task = new MyTask();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String dateString = "2016-3-13 11:17:00";
                timer.schedule(task, sdf.parse(dateString));
                timer.cancel();
//                System.out.println("end " + i);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
