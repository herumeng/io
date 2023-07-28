package p5_Buffered.p8_bufferedCopy;

import java.io.*;

public class C1_BufferedCopy {

    public static void main(String[] args) {
        C1_BufferedCopy bufferedCopy = new C1_BufferedCopy();
        bufferedCopy.copyFile();
    }

    public void copyFile(){
        String srcFileName = "E:\\file\\file2.txt";
        String destFileName = "E:\\file\\a.txt";

        //在使用处理流（包装流）时，关闭流只需要关闭最外层的流即可
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(srcFileName)); BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destFileName));){

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
