package chapter.second.synOutAsyn;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyan on 2016/3/3.
 */
public class MyList {
    private List<String> list = new ArrayList<String>();
    synchronized public void add(String username){
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了add方法!");
        list.add(username);
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了add方法!");
    }

    synchronized public int getSize(){
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "执行了getSize方法!");
        int sizeValue = list.size();
        System.out.println("ThreadName=" + Thread.currentThread().getName() + "退出了getSize方法!");
        return sizeValue;
    }
}
