import java.util.*;

public class ConsecutiveVowel{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().toLowerCase();
    String [] str = s.split(" ");
    int count = 0;
    for(int i = 0 ; i<str.length; i++){
      for(int j = 0 ; j<str[i].length();j++){
        if(isVowel(str[i].charAt(j)) && isVowel(str[i].charAt(j+1))){
          count++;
          break;
        }
      }
    }

    System.out.println(count);
  }
  public static boolean isVowel(char c){
    if(c=='a' ||  c=='e' || c=='i' || c=='o' || c=='u'){
      return true;
    }
    return false;
  }
}
