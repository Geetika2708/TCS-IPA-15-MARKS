import java.util.*;

public class CountPrime{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int count = 0;
    int r = 0;
    while(num>0){
      r = num%10;
      if(isPrime(r)){
        count++;
      }
      num = num/10;
    }
    System.out.println(count);
  }
  public static boolean isPrime(int n){
    for(int i =2 ; i<n ; i++){
      if(n%i ==0){
        return false;
      }
    }
    return true;
  }
}
