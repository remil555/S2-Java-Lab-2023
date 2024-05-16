import java.io.*;
import java.util.*;  

class CopyFile {  
    
    public static void copyData(File file1, File file2) throws IOException {  
        FileInputStream inputStream = new FileInputStream(file1);  
        FileOutputStream outputStream = new FileOutputStream(file2);  
 
        int i; 
        while ((i = inputStream.read()) != -1) {  //reading character by character in UNICODE format
            outputStream.write(i);  
        }
        
        inputStream.close();  
        outputStream.close();   

        System.out.println("File Copied");  
    }  
 
    public static void main(String[] args) throws IOException {  
        Scanner sc = new Scanner(System.in);  

        System.out.println("Enter the name of the file from where the data would be copied :");  
        String file1 = sc.nextLine();  
 
        File a = new File(file1);  
  
        System.out.println("Enter the name of the file to where the data would be written :");  
        String file2 = sc.nextLine();  
 
        File b = new File(file2); 

        copyData(a, b);  //throws IOException
    }  
}
