package p4_fileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class C1_FileReader {

    public static void main(String[] args) {
        C1_FileReader c1FileReader = new C1_FileReader();
        c1FileReader.readFile2();
    }

    public void readFile1(){
        String fileName = "E:\\file\\file2.txt";
        int readData = 0;
        try (FileReader fileReader = new FileReader(fileName);){
            while ((readData = fileReader.read()) != -1) {
                System.out.print((char) readData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void readFile2(){
        String fileName = "E:\\file\\file2.txt";
        int readLen = 0;
        char[] chars = new char[8];
        try (FileReader fileReader = new FileReader(fileName);){
            while ((readLen = fileReader.read(chars)) != -1) {
                System.out.print(new String(chars, 0, readLen));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
