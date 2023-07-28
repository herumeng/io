package p16_homeWork;

import java.io.*;

/**
 * 使用BufferesReader读取一个文本文件，为每行加上行号，
 * 再连同内容一并输出到屏幕上
 */
public class C2_work {

    public static void main(String[] args) {
        C2_work c2Work = new C2_work();
        c2Work.readFile();
    }

    private void readFile() {
        String fileName = "E:\\file\\file4.txt";
        String line = null;
        //顺便解决乱码问题
        try (InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(fileName), "gbk")) {
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            int i = 1;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(i + "：" + line);
                i++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
