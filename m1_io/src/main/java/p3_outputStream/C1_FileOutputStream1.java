package p3_outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class C1_FileOutputStream1 {
    public static void main(String[] args) {
        C1_FileOutputStream1 fileOutputStream1 = new C1_FileOutputStream1();
        fileOutputStream1.writeFile1();
    }

    public void writeFile1(){
        String fileName = "E:\\file\\a.txt";
        //FileOutputStream(String name)  创建 FileOutputStream 对象，用于写文件，会覆盖原有内容
        //FileOutputStream(String name,  boolean append)  创建 FileOutputStream 对象，用于写文件，会追加内容
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName, true);){
            //方式一：写入一个字节
            //fileOutputStream.write('H');

            //写入字符串
            String remark = "hello, world";
            //方式二：  .getBytes() 可以把一个字符串转成字节数组
            //fileOutputStream.write(remark.getBytes());


            //方式三： .getBytes() 可以把一个字符串转成字节数组
            fileOutputStream.write(remark.getBytes(), 0, remark.length()-1);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
