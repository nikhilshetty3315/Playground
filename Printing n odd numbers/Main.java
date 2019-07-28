import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int sum = 0;
      for (int count = 1; sum<n ; count = count+1)
      {
        if (count%2 == 1)
        {
          System.out.println(count);
          sum = sum+1;
        }
	}
}
}