import java.util.Scanner;
class Main{
	public static void main (String[] args) 
    {
		Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int s= in.nextInt();
      int product= n*s;
      System.out.println(product);
	}
}