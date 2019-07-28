import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in =  new Scanner (System.in);
      int n =  in.nextInt();
      for (int i = 2 ; i <= n ; i++)
      {
        if (prime_number(i))
        {
          System.out.println(i);
        }
      }
    }
    
  public static boolean prime_number(int m)
  {
    boolean prime_number = true;
    for (int num = 2 ; num <= m/2; num++ )
    {
      if (m % num == 0)
      {
        prime_number = false;
        break;
      }
	}
     return prime_number;
}
    }