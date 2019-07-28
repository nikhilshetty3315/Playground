import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int num = n;
      for (int row_no = 1; row_no <= n; row_no++)
      {
        for(int col_no = num ; col_no>=1 ; col_no--)
        {
          System.out.print(col_no);
        }
        num--;
        System.out.print("\n");
      }     
	}
}