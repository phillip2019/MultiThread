package chapter.third.pipInputOutput;

import java.io.PipedOutputStream;

/**
 * Created by wuyan on 2016/3/9.
 */
public class ThreadWrite extends Thread {
    private WriteData write;
    private PipedOutputStream out;

    public ThreadWrite(WriteData write, PipedOutputStream out) {
        this.write = write;
        this.out = out;
    }

    @Override
    public void run() {
        super.run();
        write.writeMethod(out);
    }
}
