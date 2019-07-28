import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      StringBuilder sb = new StringBuilder (str);
      int str_len = sb.length();
      int end = str_len - 1;
      int front = 0;
      boolean is_match = false;
      while (front<end)
      {
        if (sb.charAt(front) == sb.charAt(end))
        {
          is_match = true;
          break;
        }
        else if (sb.charAt(front) != sb.charAt(end)) // if then given chars in the input are not equal it returns false
        {
          is_match = false;
          break;
        }
      }
      if (is_match == true)
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}
  