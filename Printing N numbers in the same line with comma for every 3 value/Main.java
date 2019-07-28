import java.util.Scanner;
class Main 
{
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int n = in.nextInt();
  int count;
  for(count=1 ; count <= n; count++) 
  {
   System.out.print(count);
   if(count % 3 == 0)
   {
    System.out.print(",");
   }
 }
}
}