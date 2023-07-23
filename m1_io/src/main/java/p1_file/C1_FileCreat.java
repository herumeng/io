package p1_file;

import java.io.File;
import java.io.IOException;

public class C1_FileCreat {

    public static void main(String[] args) {
        C1_FileCreat filecreat = new C1_FileCreat();
        filecreat.newFile1();
        filecreat.newFile2();
        filecreat.newFile3();
    }

    //方式1 new File(String pathname)
    public void newFile1(){
        String fileName = "E:\\file\\file1.txt";
        File file = new File(fileName);
        try {
            file.createNewFile();
            System.out.println("创建文件成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //方式2 new File(File parent, String child)
    public void newFile2(){
        File parentFile = new File("E:\\file");
        String fileName = "file2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建文件成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    //方式3 new File(String parent, String child)
    public void newFile3(){
        String parentFileName = "E:\\file";
        String fileName = "file3.txt";
        File file = new File(parentFileName, fileName);
        try {
            file.createNewFile();
            System.out.println("创建文件成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
