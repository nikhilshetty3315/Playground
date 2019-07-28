import java.util.Scanner;
class Main
{
  public static int square (int num)
  {
    int square_number = num*num;
    return square_number;
  }
	public static void main (String[] args)
    {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int square_of_number = square(n);
      System.out.println(square_of_number); 
	} 
}