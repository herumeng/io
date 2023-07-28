package p5_Buffered.p9_streamBufferedCopy;

import java.io.*;

public class C1_StreamBufferCopy {

    public static void main(String[] args) {
        C1_StreamBufferCopy streamBufferCopy = new C1_StreamBufferCopy();
        streamBufferCopy.copyFile();
    }

    private void copyFile() {
        String srcFileName = "E:\\file\\hun.jpg";
        String destFileName = "E:\\file\\hunCopy.jpg";
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(srcFileName));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFileName));) {

            byte[] buff = new byte[1024];
            int readLen = 0;
            //循环读取文件并写入
            while ((readLen = bufferedInputStream.read(buff)) != -1) {
                bufferedOutputStream.write(buff, 0, readLen);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
