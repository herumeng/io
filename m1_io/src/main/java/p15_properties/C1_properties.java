package p15_properties;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C1_properties {
    public static void main(String[] args) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("m1_io\\src\\main\\resources\\mysql.properties"))) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {//循环读取配置文件
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
