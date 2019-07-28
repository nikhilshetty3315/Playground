import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      for (int factors = 1 ; factors <= n ; factors++)
      {
        if (n % factors == 0)
        { 
          System.out.println(factors);
}
}
    }
}