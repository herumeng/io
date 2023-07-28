package p13_transformation;

import java.io.*;

/**
 * 使用 InputStreamReader 转换流解决中文乱码问题
 * 将字节流 FileInputStream 转成字符流 InputStreamReader， 指定编码 gbk/utf-8
 */
public class C2_InputStreamReader {

    public static void main(String[] args) {
        C2_InputStreamReader c2InputStreamReader = new C2_InputStreamReader();
        c2InputStreamReader.readFile();
    }

    private void readFile() {
        String fileName = "E:\\file\\file4.txt";
        String line = null;

        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName), "gbk");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);){
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

