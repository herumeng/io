package p3_outputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C2_FileCopy {

    public static void main(String[] args) {
        C2_FileCopy fileCopy = new C2_FileCopy();
        fileCopy.copyFile1();
    }

    public void copyFile1(){
        String srcFileName = "E:\\file\\hun.jpg";
        String descFileName = "E:\\file\\a\\b\\hun.jpg";
        byte[] bytes = new byte[1024];
        int readLen = 0;
        try (FileInputStream fileInputStream = new FileInputStream(srcFileName);
             FileOutputStream fileOutputStream = new FileOutputStream(descFileName);){

            //先读，后写
            while ((readLen = fileInputStream.read(bytes)) != -1) {
                fileOutputStream.write(bytes, 0, readLen);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
