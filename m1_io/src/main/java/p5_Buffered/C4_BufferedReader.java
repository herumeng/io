package p5_Buffered;

public class C4_BufferedReader extends C1_Reader{

    public C1_Reader reader;

    public C4_BufferedReader(C1_Reader reader) {
        this.reader = reader;
    }

    public void read(){
        reader.read();
    }

    public void read(int num){
        for (int i = 0; i < num; i++) {
            reader.read();
        }
    }

//    public void fileReader(){
//        reader.fileReader();
//    }
//
//    public void fileReader(int num){
//        for (int i = 0; i < num; i++) {
//            reader.fileReader();
//        }
//    }
//
//    public void stringReader(int num){
//        for (int i = 0; i < num; i++) {
//            reader.stringReader();
//        }
//    }

}
