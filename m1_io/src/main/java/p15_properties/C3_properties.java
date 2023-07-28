package p15_properties;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

public class C3_properties {
    public static void main(String[] args) throws Exception {

        //创建 Properties 对象
        //Properties 父类是 Hashtable， 底层就是 Hashtable
        Properties properties = new Properties();
        //创建
        //如果该文件没有 key 就是创建，
        //如果该文件有 key 就是修改
        properties.setProperty("charSet","utf-8");
        properties.setProperty("user","汤姆");
        properties.setProperty("pwd","123");

        properties.store(new FileOutputStream("m1_io\\src\\main\\resources\\mysql1.properties"),
                "注释");


    }
}
