package p5_Buffered;

public class C5_Test {

    public static void main(String[] args) {

//        C4_BufferedReader c4BufferedReader = new C4_BufferedReader(new C2_FileReader());
//        c4BufferedReader.fileReader(3);
//        c4BufferedReader.fileReader();
//
//        C4_BufferedReader c4BufferedReader1 = new C4_BufferedReader(new C3_StringReader());
//        c4BufferedReader1.stringReader(2);

        C4_BufferedReader c4BufferedReader = new C4_BufferedReader(new C2_FileReader());
        c4BufferedReader.read(3);
        c4BufferedReader.read();

        C4_BufferedReader c4BufferedReader1 = new C4_BufferedReader(new C3_StringReader());
        c4BufferedReader1.read(2);

    }

}
