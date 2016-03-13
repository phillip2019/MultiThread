package chapter.sixth.singleton_1;

/**
 * Created by songxiaowei on 2016/3/13.
 */
public class MyObject {
    private static MyObject myObject;

    public MyObject() {
    }

    public static MyObject getInstance(){
        //延迟加载
        if(myObject==null)
            myObject = new MyObject();
        return myObject;
    }
}
