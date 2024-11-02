import java.util.*;

public class CountLower{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().toLowerCase();
    String [] str =  s.split(" ");
    int count = 0 ;
    for(int i = 0 ; i < str.length;i++){
        char d = str[i].charAt(0);
        if(isVowel(d)){
            count++;
        }
    }
    System.out.println(count);
  }
  public static boolean isVowel(char ch){
      if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
          return true;
      }
      else{
          return false;
      }
  }
}
