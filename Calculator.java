import java.util.*;

public class Armstrong{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    char ch = sc.next().charAt(0);
    
 
        if(ch == '+')
        System.out.println(num1+num2);
        else if(ch == '-')
        System.out.println(num1-num2);
        else if(ch == '*')
        System.out.println(num1*num2);
        else if(ch == '/')
        System.out.println(num1/num2);
        else
        System.out.println("no opeartor found");

    
  }
}
