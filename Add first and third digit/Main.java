import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
    	Scanner s = new Scanner(System.in);
        int num = s.nextInt();
      	int f = num / 100;
       	int l = num % 10;
        int sum = l + f;
        
        System.out.println(sum);
    }
}