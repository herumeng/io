package p16_homeWork;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 在判断e盘下是否有文件夹mytemp，如果没有就创建
 * 在e://mytemp目录下，创建文件hello.txt,并写入hello world,如果存在就提示
 */
public class C1_work {

    public static void main(String[] args) {
        C1_work c1Work = new C1_work();
        c1Work.creatFile();
    }

    private void creatFile() {
        String fileName = "e://file//mytemp";
        File file = new File(fileName);
        if(!file.exists()){
            if(file.mkdir()) {
                System.out.println("mytemp 创建成功");
            }else{
                System.out.println("hello.txt 创建失败");
            }
        }
        fileName += "//hello.txt";
        file = new File(fileName);
        BufferedWriter bufferedWriter = null;
        if(!file.exists()){
            try {
                if(file.createNewFile()) {
                    bufferedWriter = new BufferedWriter(new FileWriter(fileName));
                    bufferedWriter.write("hello world");
                }else{
                    System.out.println("hello.txt 创建失败");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }else {
            System.out.println("hello.txt 已存在");
        }
    }

}
