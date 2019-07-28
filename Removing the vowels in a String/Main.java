import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner (System.in);
    String str = in.nextLine();
    String neww = removevowels(str);
    System.out.print(neww);
  }
  public static String removevowels(String str)
  {
    String finalstring = "";
    for(int i = 0 ; i< str.length();i++)
    {
      char ch = str.charAt(i);
        if (!isvowel(Character.toLowerCase(ch)))
        {
          finalstring = finalstring+ch;
        }
    }
    return finalstring;
  }
  public static boolean isvowel(char c)
  {
    String vowels = "aeiou";
    for(int i = 0 ; i<5 ; i++)
    {
      if ( c == vowels.charAt(i))
      {
        return true;
      }
    }
    return false;
  }
}

      