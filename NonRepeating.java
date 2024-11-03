import java.util.*;
public class Nonrepeat{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ch = "";
    for(int i = 0 ; i<s.length();i++){
      if(isNonrepeat(s.charAt(i),ch)){
        ch = ch + s.charAt(i);
      }
      else{
        break;
      }
    }
    System.out.println(ch);
  }
  public static boolean isNonrepeat(char c , String ch){
    for(int i = 0 ; i<ch.length();i++){
      if(c == ch.charAt(i)){
        return false;
      }
    }
    return true;
  }
}
