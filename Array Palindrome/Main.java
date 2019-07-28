import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int i = 0 ; i <= arr_size-1 ; i++)
      {
        arr[i] = in.nextInt();
      }
      int first = 0;
      int last = arr_size-1;
      int is_occurred = 0;
      while(first<last)
      {
        if(arr[first] != arr [last])
        {
          is_occurred = 1;
          break;
        }
        first++;
         last--;
      }
      if(is_occurred == 0)
      {
        System.out.println("Yes");
      }
      else if (is_occurred == 1)
      {
        System.out.println("No");
      }
    }
}

      
        