package p14_printStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

/**
 * 字节打印流
 */
public class C1_PrintStream {

    public static void main(String[] args) {
        PrintStream out = System.out;
        //在默认情况下 PrintStream 输出数据的位置是标准输出，即显示器
        /**
         public void print(String s) {
         if (s == null) {
         s = "null";
         }
         write(s);
         }
         */
        out.println("哈哈哈哈哈");
        //因为 print 底层使用的是write，所以我们可以直接调用write进行打印输出
        try {
            out.write("哈喽".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            out.close();
        }


        //我们可以修改打印流输出流的位置/设备
        try {
            System.setOut(new PrintStream("E:\\file\\file5.txt"));
            System.out.println("hello啊,哈哈哈哈");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
