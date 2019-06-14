import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner n = new Scanner(System.in);
      int n1 = n.nextInt();
      int n2 = n.nextInt();
      int n3 = n.nextInt();
      int sum = n1+n2+n3;
      int avg = sum/3;
      System.out.println(avg);
	}
}