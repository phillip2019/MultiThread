package chapter.sixth.singleton_5;

/**
 * Created by songxiaowei on 2016/3/13.
 */
public class MyObject {
    private volatile static MyObject myObject;

    public MyObject() {
    }

    public static MyObject getInstance(){
        try{
            if(myObject == null){
                Thread.sleep(3000);
                synchronized (MyObject.class){
                    if(myObject==null){
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return myObject;
    }
}
