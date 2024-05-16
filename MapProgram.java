import java.util.*;

public class MapProgram {
    public static void display(Map<Integer,String>map){
        for(Map<Integer,String> ele:map.entryset()){
            int key=ele.getKey();
            String value=ele.getValue();
            System.out.println(key+":"+value);
        }
    }
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<Integer,String>();

        int len=args.length;
        for(int i=0;i<len;i=i+2){
            map.put(Integer.parseInt(args[i]),args[i+1]);

        }
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Menu");
            System.out.println("1.Display the Name of the given RollNO ");
            System.out.println("2. Display all Roll Numbers corresponding to a given Name");
            System.out.println("3. Display all entries in the Map");
            System.out.println("4. Insert an entry for a new student");
            System.out.println("5. Remove the entry for a given Roll Number");
            System.out.println("6. Remove the entries for a given Name");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = Scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Rollno:");
                    Integer rn=sc.nextInt();
                    String name=map.get(rn);
                    System.out.println(name);
                    
                    break;
                case 2:
                   System.out.println("Enter the name:");
                   String name1=sc.nextLine();
                   Integer rn1=map.get(name1);
                   System.out.println(rn1);
                   break;
                case 3:
                   System.of.println("All the entries are:");
                   display(map);
                   break;
                case 4:
                   System.out.println("Enter the roll no:");
                   Integer rn2=sc.nextInt();
                   System.out.println("Enter the name:");
                   String name2=sc.nextLine();
                   map.put(rn2,name2);
                   break;
                case 5:
                   System.out.println("Enter the rollno to remove:");
                   Integer rn3=sc.nextInt();
                   map.remove(rn3);
                   break;
                
                   
                
            
                default:
                
                    break;
            }

        }while(choice!=0);
        
    }
    
}
