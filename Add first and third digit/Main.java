import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      int n1 =in.nextInt();
      int n = n1%10;
      int r=0;
       while(n1!=0)
       {
         r = n1%10;
         n1=n1/10;
         }
      int s;
        s= r+n;
      System.out.println(s);
      
		// Type your code here
	}
}