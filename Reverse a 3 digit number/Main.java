import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int p = n%10;
    int l = p*100;
    int q = n/10;
    int r = q%10;
    int m = r*10;
    int s =n/100;
    int o = l+m+s;
    System.out.println(o);
  }
}