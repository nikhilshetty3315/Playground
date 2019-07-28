import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt(); 
      int arr[] = new int[arr_size];
      for (int idx = 0 ; idx < arr_size ; idx++)
      {
        arr[idx] = in.nextInt();
      }
      int max_num;
      if (arr[0] < arr[1])
      {
        max_num = arr[1];
      }
      else
      {
        max_num = arr[0];
      }
      for (int idx = 2; idx <=arr_size-1 ;idx++)
      {
        if (max_num < arr[idx])
        {
        max_num=arr[idx];
        }
      }
      System.out.println(max_num);
    } 
    }