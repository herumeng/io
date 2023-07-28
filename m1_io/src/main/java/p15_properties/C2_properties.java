package p15_properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class C2_properties {
    public static void main(String[] args) throws Exception {

        //创建 Properties 对象
        Properties properties = new Properties();
        //加载指定文件
        properties.load(new FileReader("m1_io\\src\\main\\resources\\mysql1.properties"));
        //把k-v显示到控制台
        properties.list(System.out);
        //根据key获取对应的值
        String user = properties.getProperty("user");
        System.out.println(user);

    }
}
