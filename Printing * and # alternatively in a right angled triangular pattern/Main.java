import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
  		int n = in.nextInt();
      int turn = 0 ;
      for (int cur_row = 1 ; cur_row <= n ; cur_row++)
      {
        for(int cur_col = 1; cur_col <= cur_row ; cur_col++)
        {
          if (turn == 0)
          {
            System.out.print("*");
            turn = 1;
          }
          else
          {
            System.out.print("#");
            turn = 0;
          }
    }
 System.out.print("\n");
      }
      in.close();
    }
}
