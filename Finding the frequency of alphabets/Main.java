import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuilder sb = new StringBuilder(str);
        int str_len = sb.length();
        int stat[] = new int[70]; 
        for(int idx = 0; idx < 70; idx++){
            stat[idx] = 0;
        }
        for(int idx = 0; idx < str_len; idx++)
        {
            if(sb.charAt(idx) >= 'A' && sb.charAt(idx) <= 'Z')
            {
                int offset = sb.charAt(idx) - 'A';
                char ch = (char)('a' + offset);
                sb.setCharAt(idx, ch);
            }
            if(sb.charAt(idx) >= 'a' && sb.charAt(idx) <= 'z')
            {
              int offset = (sb.charAt(idx) - 'a');
                stat[offset]++;
            }  
        }
        for(int i = 0; i < str_len; i++)
        {
            if(stat[sb.charAt(i) -'a'] != 0)
            {
                System.out.print(sb.charAt(i) +"" +stat[sb.charAt(i)-'a'] + " ");
                stat[sb.charAt(i) -'a'] = 0;
            }
        }
    }
}