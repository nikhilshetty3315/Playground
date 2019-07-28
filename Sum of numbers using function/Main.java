import java.util.Scanner;
class Main{
  public static int sum_numbers (int num)
  {
    int sum = 0;
  for (int n = 1 ; n <= num; n++)
  {
    sum = sum + n;
  }
    return sum;
  }   
	public static void main (String[] args)
    {
	   Scanner in = new Scanner (System.in);
      int number = in .nextInt();
      int sum_of_numbers = sum_numbers(number);
      System.out.println(sum_of_numbers);
	}
}