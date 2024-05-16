import java.util.ArrayList;
import java.util.Iterator;



public class Color {
    public static void display(ArrayList<String> array1){
            Iterator<String> itr=array1.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
        public static void diff(ArrayList<String> array1,ArrayList<String> array2){
            Iterator<String> itr1=array1.iterator();
            // Iterator<String> itr2=array2.iterator();
            while(itr1.hasNext()){
                String temp=itr1.next();
                if(array2.indexOf(temp)!=-1){
                    // array1.remove(temp);
                    itr1.remove();
                }

            }
            display(array1);

        }

    

    public static void main(String[] args) {
        
         int size1= Integer.parseInt(args[0]);
          System.out.println(size1);
         ArrayList<String> list1=new ArrayList<>(size1);
         for(int i=1;i<=size1;i++)
         {
            list1.add(args[i]);
         }
          System.out.println(list1);


        int size2=Integer.parseInt(args[size1+1]);
        System.out.println(size2);
         ArrayList<String> list2=new ArrayList<>(size2);
         for(int i=size1+2;i<args.length;i++)
         {
            list2.add(args[i]);
         }
          System.out.println(list2);

        //Color C =new Color();
        // System.out.println("List1:");
        //   display(list1);
        //   System.out.println("List2:");
        //   display(list2);
            
          System.out.println("Difference :");
         diff(list1,list2);


    }
}