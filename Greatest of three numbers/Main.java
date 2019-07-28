import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in =  new Scanner(System.in);
      int n = in.nextInt();
      int l = in.nextInt();
      int m = in.nextInt();
      if (n>l)
      {
        if (n>m)
        {
          System.out.println(n);
        }
        else
        {
          System.out.println(m);
        }
      }
        else
        {
        if (l>m)
        {
          System.out.println(l);
        }
        else
        {
          System.out.println(m);
      }
    }
    }
}