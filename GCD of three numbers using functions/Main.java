import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int m = in.nextInt();
	    int p = in.nextInt();
	    int result = gcd_of_2_numbers(n, m);
	    System.out.print(gcd_of_2_numbers(result, p));
	}
	public static int gcd_of_2_numbers(int num1, int num2)
	{
	    int min_element;
	    if(num1 < num2)
	    {
	        min_element = num1;
	    }
	    else{
	        min_element = num2;
	    }
	    while(min_element >= 1)
	    {
	        if((num1 % min_element == 0) &&(num2 % min_element == 0))
	        {
	            return min_element;
	        }
	        --min_element;
	    }
	    return 0;
	}
}