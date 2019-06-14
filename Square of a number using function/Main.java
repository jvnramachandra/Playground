import java.util.Scanner;
class Main{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
	    int number = sc.nextInt();
        int sum = sqmbers(number);
        System.out.println(sum);
    }

    public static int sqmbers(int num) {
       int a = num*num;
      return a;
    }
}
