import java.util.Scanner;
class Main{
	public static void main (String[] args){
        Scanner in = new Scanner (System.in);
      int num = in .nextInt();
      int fact = 1;
      for (int count = 1 ; count <= num ; count ++)
      {
        fact = fact*count;
	}
      System.out.println(fact);
    }
}