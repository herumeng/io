package p16_homeWork;

import com.sun.corba.se.impl.orbutil.ObjectWriter;

import java.io.*;
import java.util.Properties;

/**
 * 编写一个dog.properties
 * name=tom
 * age=5
 * color=red
 * 编写Dog类，创建对象，使用配置文件中相应内容，完成对象属性的初始化，并输出
 * 将创建好的Dog对象序列化到文件dog.txt文件中
 */
public class C3_work {

    public static void main(String[] args) {
        C3_work c3Work = new C3_work();
        c3Work.readProperties();
    }

    private void readProperties() {

        String fileName = "m1_io\\src\\main\\resources\\dog.properties";
        Properties properties = new Properties();
        Dog dog = new Dog();
        try {
            properties.load(new FileReader(fileName));
            dog.setName(properties.getProperty("name"));
            if(properties.getProperty("age") != null){
                dog.setAge(Integer.valueOf(properties.getProperty("age")));
            }
            dog.setColor(properties.getProperty("color"));
            System.out.println(dog);

            //将创建好的Dog对象序列化到文件dog.txt文件中
            String fileName1 = "E:\\file\\dog.txt";
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName1));
            objectOutputStream.writeObject(dog);
            objectOutputStream.close();

            //dog.txt文件中信息反序列化出来
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName1));
            Object dog1 = objectInputStream.readObject();
            System.out.println(dog1);
            objectInputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
