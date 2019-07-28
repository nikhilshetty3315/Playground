import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in =new Scanner(System.in);
      int n= in.nextInt();
      int o= in.nextInt();
      int p= in.nextInt();
      int sum= n+o+p;
      int average= sum/3;
      System.out.println(average);
	}
}