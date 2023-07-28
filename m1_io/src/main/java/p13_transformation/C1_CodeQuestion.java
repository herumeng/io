package p13_transformation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试一个乱码问题
 */
public class C1_CodeQuestion {
    public static void main(String[] args) {
        C1_CodeQuestion c1CodeQuestion = new C1_CodeQuestion();
        c1CodeQuestion.readFile();
    }

    private void readFile() {
        String fileName = "E:\\file\\file4.txt";
        String line = null;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
