import java.util.*;
public class Fibo{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int i = 0;
    int k =1;
    System.out.println(i+" ");
    while(k<num){
      System.out.println(k + " " );
      int p = k;
      k = k+i;
      i = p;
    }
  }
}
