import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

class WriteReadFile {
    public static void main(String[] args) throws IOException {

        String str = "File Handling in Java using FileWriter and FileReader\n";

        FileWriter fw = new FileWriter("output.txt");

        fw.write(str);

        fw.close();

        int ch;
 
        FileReader fr = new FileReader("output.txt");

        while ((ch = fr.read()) != -1)
            System.out.print((char)ch);
 
        fr.close();   
    }
}