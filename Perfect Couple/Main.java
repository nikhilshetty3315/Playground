 import java.util.Scanner;
class Main{
    public static void main(String args[]) {
    Scanner in = new Scanner (System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int index = 0 ; index<arr_size ;index++)
      {
        arr[index] = in.nextInt();
      }
      int value = in.nextInt();
      pair_of_elements( arr,arr_size,value);
    }
  public static void pair_of_elements(int arr[] , int arr_size, int value)
  {
    for ( int index_1 = 0; index_1 <=(arr_size-1) ;index_1++)
    {
      for (  int index_2 = (index_1+1) ;index_2<=(arr_size-1);index_2++)
      {
        int sum = arr[index_1]+arr[index_2];
        if (sum == value)
        {
          System.out.println(arr[index_1] + "," + " " + arr[index_2]);
        }
      }
    }
  }
}