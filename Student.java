

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*

Question 17 : 
Create a Map of students with Roll numbers as Keys and the Student names as Values, and 
do the following operations on this map using a menu driven program.
1.Display Name corresponding to a given Roll number. (Mandatory Usage : get())
2.Display all Roll Numbers corresponding to a given Name. (Homework)
3.Display all entries in the Map. (Mandatory Usage :  entrySet() ,  Map.Entry<>,  getKey() ,  getValue() )
4.Insert an entry for a new student to the map. ( Mandatory Usage : put(), putIfAbsent())
5.Remove the entry for a given Roll Number ( Mandatory Usage : containsKey())  
6.Remove the entries for a given Name ( Homework) (Mandatory Usage : containsValue())

*/

public class Student {

    public static void Get_name(Map<Integer, String> st) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rollno.: ");
        int rollno = sc.nextInt();
        System.out.println("Name : " + st.get(rollno));
        // for(Map.Entry<Integer,String> st1: st.entrySet()){
        // //if(st1.getKey().equals(rollno))

        // System.out.println("Name : "+st1.get(rollno));
        // }

       

    }



    public static void Get_Rollno(Map<Integer, String> st) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name  : ");
        String value = sc.nextLine();
        for (Map.Entry<Integer, String> st1 : st.entrySet()) {
            if (st1.getValue().equals(value))

                System.out.println("Rollno : " + st1.getKey());

        }
        

    }


    public static void Display_elements(Map<Integer, String> st) {
        System.out.println();
        System.out.println("All Elements:");
         for (Map.Entry<Integer, String> st1 : st.entrySet()) {
            System.out.print(st1.getKey() + " : ");
            System.out.println(st1.getValue());
        }
    }



    public static Map<Integer, String> Insert_ele(Map<Integer, String> st) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rollno to insert: ");
        int rollno = sc.nextInt();
        System.out.print("Enter Name to insert : ");
        String name = sc.next();
        st.putIfAbsent(rollno, name);
        
        return st;
    }

    public static void Remove_with_rollno(Map<Integer, String> st) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rollno. to remove : ");
        int rollno = sc.nextInt();
        if (st.containsKey(rollno)) {
            st.remove(rollno);
        } else {
            System.out.println("Roll no.does not exist..!");
        }
       

    }

    public static void Remove_with_name(Map<Integer, String> st) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name to remove  : ");
        String name = sc.next();
        if (st.containsValue(name)) {
            for (Map.Entry<Integer, String> st1 : st.entrySet()) {
                if (st1.getValue().equals(name)) {
                    int x = st1.getKey();
                    st.remove(x);
                    break;
                }

            }

        } else {
            System.out.println("Name does not exist..!");
        }
        
    }

    public static void main(String[] args) {

        Map<Integer, String> student = new HashMap<Integer, String>();
        // student.put(1,"Abin");
        // student.put(2,"Adarsh");
        // student.put(3,"Aiswarya");
        // student.put(4,"Akhil");
        // student.put(5,"Anand");
        for (int i = 0; i < args.length; i = i + 2) {
            student.put(Integer.parseInt(args[i]), args[i + 1]);
        }

        // 3
        // for (Map.Entry<Integer, String> st : student.entrySet()) {
        //     System.out.print(st.getKey() + " : ");
        //     System.out.println(st.getValue());
        // }

        // 1
        Get_name(student);

        // 2. Homework
        Get_Rollno(student);


        // 3
        Display_elements(student);


        // 4
        student = Insert_ele(student);
        Display_elements(student);

        // 5
        Remove_with_rollno(student);
        Display_elements(student);

        // 6
        Remove_with_name(student);
        Display_elements(student);

    }

}