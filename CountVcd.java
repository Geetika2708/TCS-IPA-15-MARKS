import java.util.*;
public class CountVcd{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int digit = 0;
    int vowel = 0;
    int consonant = 0;

    for(int i = 0 ; i < s.length(); i++){
      if(Character.isLetter(s.charAt(i))){
        if(isVowel(s.charAt(i))){
          vowel++;
        }
        else{
          consonant++;
        }
        
      }
      else if(Character.isDigit(s.charAt(i))){
        digit++;
      }
    }
    System.out.println(vowel);
    System.out.println(consonant);
    System.out.println(digit);
  }
  public static boolean isVowel(char c){
    if(c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U'){
      return true;
    }
    else {
      return false;
    }
  }
}
