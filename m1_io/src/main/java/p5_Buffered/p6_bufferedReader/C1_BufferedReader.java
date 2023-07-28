package p5_Buffered.p6_bufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C1_BufferedReader {

    public static void main(String[] args) {

        C1_BufferedReader c1BufferedReader = new C1_BufferedReader();
        c1BufferedReader.readFile();

    }

    public void readFile(){
        String fileName = "E:\\file\\file2.txt";

        //在使用处理流（包装流）时，关闭流只需要关闭最外层的流即可
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));){
            //bufferedReader.readLine()   按行读取，读取到的流为null时，代表读取完毕
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
