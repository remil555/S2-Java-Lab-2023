import java.util.Scanner;

public class StackOperations<T> {

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>(5);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element:");
        int n = sc.nextInt();
        s1.push(n);
        s1.push(n + 1);

        s1.pop();
        int a = s1.pop();
        System.out.println(a);
    }
}

class Stack<T> {
    private int Size;
    private int top;
    private T[] stackArray;

    public Stack(int Size) {
        this.Size = Size;
        stackArray = (T[]) new Object[maxSize];
        top = -1;
    }

    public void push(T element) {
        if (top== Size - 1) {
            System.out.println("Stack is full");
        } else {
            stackArray[++top] = element;
            System.out.println("Pushed element " + element + " onto the stack.");
        }
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return null;
        } else {
            T poppedElement = stackArray[top];
            stackArray[top] = null; 
            top--;
            return poppedElement;
        }
    }
}
