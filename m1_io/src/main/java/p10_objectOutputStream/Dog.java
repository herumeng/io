package p10_objectOutputStream;

import java.io.Serializable;

//如果需要序列化某个类的对象，需要实现 Serializable
public class Dog implements Serializable {
    private String name;
    private int age;

    //序列化对象时，要求里面属性的类型也需要实现序列化接口
    //序列化对象时，默认将里面所有属性都进行序列化，但除了static和transient修饰的成员
    //seriaVersionUID   序列化的版本号，提高序列化的兼容性
    private static final long seriaVersionUID = 1L;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}