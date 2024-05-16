import java.io.File;

import java.util.Scanner;

public class SearchFile {

public static void main(String args[]) {

Scanner sc=new Scanner(System.in);

System.out.println("Enter Directory");

String dir=sc.next();

File myDir=new File(dir);

System.out.println("\nEnter File name");

String fnm=sc.next();

if(myDir.exists()) {

String[] lists=myDir.list();

System.out.println("\nItems are:");

for(String i : lists) {

System.out.println(i);

}

int flag=0;

for(String i : lists) {

if(i.equals(fnm)) {

System.out.println("\n File found");flag=1;break;

}

}

if(flag==0) {

System.out.println("\nFile not found");

}

}

else {

System.out.println("Directory not exist");

}

}

}