import java.util.*;
public class ArrList{

public static void Dispaly(ArrayList <String> Arr){
    Iterator itr=list.iterator();

    while(iterator.hasNext()){

    System.out.println(iterator.next());
    }
}
public void Difference(ArrayList<String> list2,ArrList<String> list1){
    for(String ele:new ArrList<>(list2)){
        if(list1.indexof(ele)!=-1)
        list2.remove(ele);
    }
    Display(list2);
}
public static void main(String args[]) {
    ArrayList<String>list1=new ArrayList<>();
    ArrayList<String>list2=new ArrayList<>(); 
    int n1=Integer.parseInt(arg[0]);
    for(int i=1;i<n1;i++){
        list1.add(args[i]);
    }
    int n2=Integer.parseInt(args[i]);
    for(int j=i+1;j<n1+n2+1;j++){
        list2.add(args[i]);
    }
    ArrList Ar=new ArrList();
    Ar.Display(list1);
    Ar.Dispaly(list2);
    Difference(list1,list2);
}
}
