package p4_fileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class C2_FileWrite {

    public static void main(String[] args) {
        C2_FileWrite c2FileWrite = new C2_FileWrite();
        c2FileWrite.writeFile1();

    }

    public void writeFile1(){
        String fileName = "E:\\file\\file2.txt";
        try (FileWriter fileWriter = new FileWriter(fileName, true);){
            //一：写入单个字符   write(int c)
//            fileWriter.write('1');

            //二：写入指定数组   write(char cbuf[])
//            char[] chars = {'1','2','3','4'};
//            fileWriter.write(chars);

            //三：写入指定数组指定部分   write(char cbuf[], int off, int len)
//            fileWriter.write("何如梦大美女".toCharArray(), 0, 6);

            //四：写入整个字符串   write(String str)
//            fileWriter.write("何如梦大美女");

            //五：写入字符串指定部分   write(String str, int off, int len)
            fileWriter.write("何如梦大美女", 3, 3);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
