import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class CopyNum {

    public static void copyData(File file1, File file2, File file3) throws IOException {  
        FileInputStream inputStream = new FileInputStream(file1);  
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3); 
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            
        String line;
        while ((line = br.readLine()) != null) {    //reading line by line in String format
            int num = Integer.parseInt(line);

            if(num % 2 == 0)  
                outputStream1.write((num + System.lineSeparator()).getBytes());
            else                                                            //getBytes() is used to convert into UNICODE format
                outputStream2.write((num + System.lineSeparator()).getBytes());     
        }  
   
        inputStream.close();
        outputStream1.close();
        outputStream2.close();  
        
        System.out.println("Even numbers and Odd numbers are copied to separate files with name \'even\' and \'odd\'");  
    }  
 
    public static void main(String[] args) throws IOException {  
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter the name of the file having integers:");  
        String file1 = sc.nextLine();  
 
        File a = new File(file1);  
 
        File b = new File("even.txt"), c = new File("odd.txt"); 
        sc.close();  

        copyData(a, b, c);  //throws IOException  
    }  
}