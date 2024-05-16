import java.util.Scanner;


class Multiplication extends Thread {
	int n1;

	public Multiplication(int n) {
		this.n1 = n;
	}

	public void run() {
		for (int i = 0; i < n1; i++) {
			System.out.println(i + " x " + "5 = " + i * 5);
		}
	}
	class Prime extends Thread {
		int num;

		Prime(int n) {
			this.num = n;
		}

		public void run() {
			long start = System.currentTimeMillis();
			int temp = 1, j = 0;
			while (j < num) {
				int count = 0;
				for (int i = 1; i <= temp; i++) {
					if (temp % i == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println("Prime is " + (j + 1) + ":" + temp);
					j++;
				}
				temp++;
			}
			long end = System.currentTimeMillis();
			long diff = (end - start);
			System.out.println("Time taken prime :" + diff);

		}

	}

	public class Mathfunctions {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Multiplication limit: ");
            int mul =sc.nextInt();
            Multiplication M=new Multiplication(mul);
            System.out.print("Enter how many prime : ");
            int pri=sc.nextInt();
            Prime P=new Prime(pri);
            long start = System.currentTimeMillis();
            
            M.start();
            P.start();
            // M.run();
            // P.run();
            long end =System.currentTimeMillis();
            long diff=(end-start);
            System.out.println("Time taken main :"+diff);
             sc.close();
    
        }
        
    }

    