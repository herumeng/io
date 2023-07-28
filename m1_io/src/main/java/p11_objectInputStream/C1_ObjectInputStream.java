package p11_objectInputStream;

import p10_objectOutputStream.C1_ObjectOutputStream;
import p10_objectOutputStream.Dog;

import java.io.*;

public class C1_ObjectInputStream {

    public static void main(String[] args) {
        C1_ObjectInputStream objectInputStream = new C1_ObjectInputStream();
        objectInputStream.readFile();
    }

    private void readFile() {
        String fileName = "E:\\file\\data.txt";
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {

            //1、读取（反序列化）的顺序  需要和你    保存数据（序列化）的顺序一致

            System.out.println(objectInputStream.readInt());
            System.out.println(objectInputStream.readBoolean());
            System.out.println(objectInputStream.readDouble());
            Object dog = objectInputStream.readObject();
            System.out.println(dog.getClass());
            System.out.println(dog);

            //序列化对象时，默认将里面所有属性都进行序列化，但除了static和transient修饰的成员
            //static和transient修饰的成员 不进行序列化
            Dog dog1 = (Dog) dog;
            System.out.println(dog1.getName());
            System.out.println(dog1.getAge());

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
