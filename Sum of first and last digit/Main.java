import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in  = new Scanner(System.in);
      int num = in.nextInt();
      int count = 0;
      int ldig = num % 10;
        // keep looping num until it is in the range of 0-9
        while (num >= 10) {
            num = num / 10;
        }
        //initialize fdig variable and set it equal to num, just to make things clearer
        int fdig = num;

        System.out.println( fdig +ldig);
    }
}
