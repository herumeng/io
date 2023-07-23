package p2_inputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class C1_FileInputStream1 {

    public static void main(String[] args) {
        C1_FileInputStream1 fileInputStream1 = new C1_FileInputStream1();
        fileInputStream1.readFile1();
        fileInputStream1.readFile2();
    }

    public void readFile1(){
        String fileName = "E:\\file\\file2.txt";
        int readData = 0;
        //创建 FileInputStream 对象，用于读取文件
        try (FileInputStream fileInputStream =new FileInputStream(fileName);){
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将组织
            //如果让返回-1，表示读取完毕
            while ((readData = fileInputStream.read()) != -1){
                System.out.println((char)readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFile2(){
        String fileName = "E:\\file\\file2.txt";
        byte[] bytes = new byte[8];
        int readLen = 0;
        //创建 FileInputStream 对象，用于读取文件
        try (FileInputStream fileInputStream =new FileInputStream(fileName);){
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将组织
            //如果让返回-1，表示读取完毕
            while ((readLen = fileInputStream.read(bytes)) != -1){
                System.out.println(new String(bytes, 0, readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
