package chapter.second.synBlockString;

/**
 * Created by wuyan on 2016/3/2.
 */
public class Service {
    private String username;
    private String password;
    private String anyString = new String();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAnyString() {
        return anyString;
    }

    public void setAnyString(String anyString) {
        this.anyString = anyString;
    }

    public void setUsernamePassword(String username, String password){
        try{
            synchronized(anyString){
                System.out.println("线程的名称为：" + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "进入同步块");
                this.username = username;
                Thread.sleep(3000);
                this.password = password;
                System.out.println("线程的名称为：" + Thread.currentThread().getName()
                + "在" + System.currentTimeMillis() + "离开同步块");
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
