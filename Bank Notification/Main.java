import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
      String bankName = in.next();
      int key = in.nextInt();
      Details obj = new Details();
      switch(key)
      {
        case 1 :
          obj.bySms(bankName);
          break;
        case 2 :
          obj.byEmail(bankName);
          break; 
         case 3 :
          obj.byCourier(bankName);
          break; 
      }
    }
}
    interface Notification
    {
    public void bySms(String bankName);
    public void byEmail(String bankName);
    public void byCourier(String bankName);
    }
  class Details implements Notification
  {
    public void bySms(String bankName)
   {
   System.out.println(bankName+"-Notification by SMS");
   }
   public void byEmail(String bankName)
   {
   System.out.println(bankName+"-Notification by Mail");
   }
   public void byCourier(String bankName)
   {
   System.out.println(bankName+"-Notification by Courier");
   }
   }
   