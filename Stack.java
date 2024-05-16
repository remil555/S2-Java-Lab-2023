import java.util.ArrayList;
import java.util.Scanner;
public class Stack01<T> {
    ArrayList<T> stack = new ArrayList<>();

    void push(T val)
    {
        stack.add(val);
        System.out.println("size " + stack.size()) ;

    }
    
    T pop()
    {
        T val = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return val;
        
    }

    public String toString() {
        String s = "";
        for(int i = stack.size()-1; i >= 0; i--)
            s = s + stack.get(i) + "\n";
        return s;
    }
    public static <T> void main(String[] args)
    {
        int opt;
        Stack01<T> stack;
        System.out.println("What type of stack is needed? (1.Double, 2.Character, 3.String)");
        Scanner sc = new Scanner(System.in);
        int type = sc.nextInt();
        if(type == 1)
            stack = (Stack01<T>) new Stack01<Double>();
        else if(type == 2)
            stack = (Stack01<T>) new Stack01<Character>();
        else
            stack = (Stack01<T>) new Stack01<String>();

        System.out.println("\nChoose the options: ");
        do{
            System.out.println("1 - PUSH, 2 - POP, 3 - DISPLAY, 0 - Exit");
            opt = sc.nextInt();
            
            if(opt == 1)
            {
                T val;
                System.out.println("Enter the element: ");
                if(type == 1)
                    val = (T)Double.valueOf(sc.nextDouble());
                else if(type == 2)
                    val = (T)Character.valueOf(sc.next().charAt(0));
                else
                    val = (T)String.valueOf(sc.next());    
                stack.push(val);
            }
            else if(opt == 2)
            {
                T rval = (T) stack.pop();
                System.out.println("Popped value: " + rval);

            }
            else if(opt == 3)
                System.out.println(stack);
        }while(opt != 0);
    }
}