import java.util.*;
public class fibooo{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int a=0;
    int b=1;
    for(int i =0; i<num;i++){
      System.out.println(a+" ");
      int next = a+b;
      a=b;
      b=next;
    }
  }
}
