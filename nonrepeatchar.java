import java.util.*;
public class Nonrepeat{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int count=0;
    for(int i = 0 ; i<s.length();i++){
     for(int j=i;j<s.length();j++){
         if(i!=j &&s.charAt(i)==s.charAt(j)){
             count++;
             break;
         }
     }
     if(count==0){
         System.out.println(s.charAt(i));
         break;
     }
     count=0;
     
    }
  }
}
  
