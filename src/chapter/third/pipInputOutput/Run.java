package chapter.third.pipInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * Created by wuyan on 2016/3/9.
 */
public class Run {
    public static void main(String[] args) {
        try{
            WriteData writeData = new WriteData();
            ReadData readData = new ReadData();

            PipedInputStream inputStream = new PipedInputStream();
            PipedOutputStream outputStream = new PipedOutputStream();

//            inputStream.connect(outputStream);
            outputStream.connect(inputStream);

            ThreadRead readThread = new ThreadRead(readData, inputStream);
            readThread.start();

            Thread.sleep(20000);

            ThreadWrite threadWrite = new ThreadWrite(writeData, outputStream);
            threadWrite.start();
        }catch (IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
