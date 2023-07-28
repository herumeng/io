package p5_Buffered.p7_bufferedWriter;

import java.io.*;

public class C1_BufferedWriter {

    public static void main(String[] args) {

        C1_BufferedWriter bufferedWriter = new C1_BufferedWriter();
        bufferedWriter.writeFile();

    }

    public void writeFile(){
        String fileName = "E:\\file\\file2.txt";

        //在使用处理流（包装流）时，关闭流只需要关闭最外层的流即可
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));){
            bufferedWriter.write("hello, world");
            //bufferedWriter.newLine()    插入一个和系统相关的换行
            bufferedWriter.newLine();
            bufferedWriter.write("hello, world");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
