import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<String> nor = new LinkedList<String>();
        String month = br.readLine();
        String arr[] = month.split(",");
        for (int i = 0 ;i<arr.length;i++)
        {
          nor.add(arr[i]);
        }
        System.out.println(nor);
        System.out.println("Size of the linked list: " + nor.size());
        System.out.println("Is LinkedList empty? " + nor.isEmpty());
        String m = br.readLine();
        System.out.println("Does LinkedList contains "+m+"?");
        System.out.println(nor.contains(m));
      
    }
}