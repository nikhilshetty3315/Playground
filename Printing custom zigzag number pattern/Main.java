import java.util.Scanner;
class Main{
	public static void main (String[] args)
    {
	  Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      for (int row_no = 1 ; row_no <= n ; row_no++)
      {
        for( int col_no = 1 ; col_no<= n ; col_no++)
        {
          if((row_no%2 == 0)&&(col_no==1)||(row_no%2 == 1)&&(col_no == n))
          {
            System.out.print( row_no+1 );
          }
            else
            {
              System.out.print(row_no);
            }
        }
        System.out.print("\n");
	}
}
}
	
