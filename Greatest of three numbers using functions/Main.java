import java.util.Scanner;
class Main{
     public static int findLargest(int a,int b, int c)
    {
        if( a>b && a> c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
     public static void main(String []args)
     {
            int a=0,b=0,c=0;
            Scanner X = new Scanner(System.in);
            a = X.nextInt(); 
            b = X.nextInt(); 
            c = X.nextInt();
            System.out.println(findLargest(a,b,c));
     }
}