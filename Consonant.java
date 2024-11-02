import java.util.*;

public class Consonant{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    for(int i = 0 ; i<s.length(); i++){
      if(isConsonant(s.charAt(i))){
        if((i+1)%2!=0){
          System.out.print(s.charAt(i));
        }
      }
    }
    
  }

  public static boolean isConsonant(char c){
    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
      return false;
    }
    return true;
  }
}
