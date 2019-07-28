import java.util.Scanner;
class Main{
  public static int greatest_of_two (int i , int j)
  {
    if (i > j)
    {
      return i ;
    }
    else 
    {
      return j ;
    }
  }
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int m = in.nextInt();
      int p = in.nextInt();
      int greatest_two = greatest_of_two(n , m);
      if (greatest_two > p)
      {
        System.out.println(greatest_two);
      }
      else
      {
        System.out.println(p);
      }
	}
}