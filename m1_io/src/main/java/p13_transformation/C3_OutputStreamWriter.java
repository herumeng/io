package p13_transformation;

import java.io.*;

public class C3_OutputStreamWriter {

    public static void main(String[] args) {
        C3_OutputStreamWriter c3OutputStreamWriter = new C3_OutputStreamWriter();
        c3OutputStreamWriter.writeFile();
    }

    private void writeFile() {
        String fileName = "E:\\file\\file4.txt";
        String charSet = "utf-8";

        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(fileName), charSet)){
            outputStreamWriter.write("hello啊, 哈哈哈哈哈");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

