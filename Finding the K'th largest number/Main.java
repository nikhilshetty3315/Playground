import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[]= new int [arr_size];
      for(int i = 0 ; i < arr_size ; i++)
      {
        arr[i] = in.nextInt();
      }
      int k = in.nextInt();
      selection_sort(arr_size,arr);
      System.out.print(arr[arr_size-k]);
    }
  public static void selection_sort(int arr_size ,int arr[])
  {
    for(int start_idx = 0; start_idx <= arr_size-2 ; start_idx++)
    {
      int min_idx = find_minimum_idx(start_idx , arr , arr_size-1);
      swap(start_idx, min_idx, arr);
    }
  }
  public static int find_minimum_idx(int start_idx ,int arr[], int end_idx)
  {
    int min_idx = 0;
    if (arr[start_idx] < arr[start_idx+1])
    {
      min_idx = start_idx;
    }
    else
    {
      min_idx = start_idx+1;
    }
    for(int i = start_idx + 2; i <= end_idx ;i++)
    {
      if (arr[min_idx] > arr[i])
      {
        min_idx = i;
      }
    }
    return min_idx;
  }
  public static void swap(int start_idx , int min_idx , int arr[])
  {
    int temp = arr[start_idx];
    arr[start_idx] = arr[min_idx];
    arr[min_idx] = temp;
  }
}

      
  
      
  
      
