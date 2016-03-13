package chapter.sixth.singleton_0;

/**
 * Created by songxiaowei on 2016/3/13.
 */
public class MyObject {
    //立即加载==恶汉模式
    private static MyObject myObject = new MyObject();

    public MyObject() {
    }

    public static MyObject getInstance(){
        //此版本的代码的缺点是不能有其它实例
        //因为getInstance()方法没有同步
        //所以有可能出现非线程安全问题
        return myObject;
    }
}
