import java.util.*;

public class Armstrong{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int temp = num;
    int r = 0;
    int result = 0;

    while(num>0){
      r = num%10;
      result += r*r*r;
      num = num/10;
    }
    if(temp == result)
    System.out.println("armstrong number");
    else 
       System.out.println("armstrong number");
  }
}
