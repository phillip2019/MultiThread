package chapter.third.pipInputOutput;

import java.io.PipedInputStream;

/**
 * Created by wuyan on 2016/3/9.
 */
public class ThreadRead extends Thread {
    private ReadData read;
    private PipedInputStream input;

    public ThreadRead(ReadData read, PipedInputStream input) {
        this.read = read;
        this.input = input;
    }

    @Override
    public void run() {
        super.run();
        read.readMethod(input);
    }
}
