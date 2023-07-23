package p1_file;

import java.io.File;

public class C2_FileInformation {

    //通过api获取文件信息
    public static void main(String[] args) {
        //创建文件对象
        File file = new File("E:\\file\\file1.txt");

        System.out.println("文件名称：" + file.getName());
        System.out.println("文件父目录：" + file.getParent());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件大小(字节)：" + file.length());
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("是否是目录：" + file.isDirectory());
        System.out.println("是否是文件：" + file.isFile());
    }
}
