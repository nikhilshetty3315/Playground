import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      StringBuilder sb= new StringBuilder (str);
      int str_len = sb.length();
      reverse_string (sb,0,str_len-1);  // reverse the whole string at once ex: mas am i
      int start_idx = 0;
      for(int idx = 0; idx<str_len ; idx++)
      {
        if(sb.charAt(idx) == ' ')
        {
          reverse_string (sb, start_idx,idx-1); //reversing the first word of reversed string it continues upto second last word ex: sam am
            start_idx = idx+1;
        }
        else if (idx == (str_len-1))
        {
          reverse_string(sb ,start_idx,idx);   //reversing the last word of reversed string ex: I
          start_idx = idx+1;
        }
      }
      System.out.print(sb);   //printing the whole string
    }
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
       int end = end_idx;
      int front = start_idx;
      while(front<end)
      {
        char temp = sb.charAt(front);
        sb.setCharAt(front , sb.charAt(end));    //swapping chars of strings
        sb.setCharAt(end,temp);
     front++;
       end--;
      }
    }
    }