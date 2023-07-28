package p12_standard;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class C1_InputAndOutPut {

    public static void main(String[] args) {
        //System类的   public final static InputStream in = null;
        //System.in  编译类型   InputStream
        //System.in  运行类型   BufferedInputStream
        //System.in  表示的是标准的输入键盘
        System.out.println(System.in.getClass());

        //System类的   public final static PrintStream out = null;
        //System.out  编译类型   PrintStream
        //System.out  运行类型   PrintStream
        //System.out  表示的是标准的输出 显示器
        System.out.println(System.out.getClass());

        String fileName = "E:\\file\\file3.txt";
        try {
            System.setOut(new PrintStream(fileName));
            System.out.println("何如梦");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
