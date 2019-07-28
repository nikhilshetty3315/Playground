import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int s= n/10;
      int p= s%10;
      System.out.println(p);
	}
}