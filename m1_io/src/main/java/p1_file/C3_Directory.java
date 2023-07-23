package p1_file;

import java.io.File;
import java.io.IOException;

public class C3_Directory {

    public static void main(String[] args) {
        C3_Directory c3Directory = new C3_Directory();
        c3Directory.deleteFile();
        c3Directory.creatFile();
    }

    //判断文件E:\file\file1.txt  是否存在，如果存在，就删除
    //在Java中目录也被当作一种文件（特殊文件）
    public void deleteFile(){
        String fileName = "E:\\file\\file1.txt";
        File file = new File(fileName);
        if(file.exists()){
            if(file.delete()){
                System.out.println(fileName + "删除成功");
            } else {
                System.out.println(fileName + "删除失败");
            }
        } else {
            System.out.println(fileName + "文件不存在");
        }
    }

    //判断文件E:\file\a\b  是否存在，如果不存在，就创建
    //创建多级目录要使用mkdirs
    public void creatFile(){
        String fileName = "E:\\file\\a\\b";
        File file = new File(fileName);
        if(file.exists()){
            System.out.println(fileName + "该目录已存在");
        } else {
            if(file.mkdirs()){
                System.out.println(fileName + "该目录创建成功");
            }else{
                System.out.println(fileName + "该目录创建失败");
            }
        }
    }


}
