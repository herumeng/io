package p10_objectOutputStream;

import java.io.*;

public class C1_ObjectOutputStream {

    public static void main(String[] args) {
        C1_ObjectOutputStream c1ObjectOutputStream = new C1_ObjectOutputStream();
        c1ObjectOutputStream.writeFile();
    }

    private void writeFile() {

        //序列化后，保存的文件格式，不是存文本，而是按照他的格式来保存
        String fileName = "E:\\file\\data.txt";

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            objectOutputStream.writeInt(100);
            objectOutputStream.writeBoolean(true);
            objectOutputStream.writeDouble(100.00);
            objectOutputStream.writeObject(new Dog("大黄", 9));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

