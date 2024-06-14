package Ex13;
import java.io.*;

public class Ex13_1 {
    public static void main(String[] args) {
        FileReader in = null;
    try {
        in =new Ex13_1("C:\Users");
        int c;
        while ((c=in.read())!=-1){
            System.out.print((char)c);
        }
        in.close();
    } catch(IOException e) {
    System.out.println("입출력 오류");
        }
    }
}


