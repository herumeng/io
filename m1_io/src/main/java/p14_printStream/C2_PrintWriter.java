package p14_printStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C2_PrintWriter {

    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter(System.out);
        printWriter.println("哈喽");
        printWriter.close();

        PrintWriter printWriter1 = new PrintWriter(new FileWriter("E:\\file\\file5.txt"));
        printWriter1.println("哈喽");
        printWriter1.close();

    }


}
