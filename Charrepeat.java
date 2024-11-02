import java.util.*;

public class Armstrong{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int j = 0;
    char ch = s.charAt(j);
    int count = 0;
    
    for(int i = 0 ; i< s.length(); i++){
        if(ch == s.charAt(i)){
            count++;
        }
        else{
            System.out.print(ch + "" + count);
            ch = s.charAt(i);
            count = 0;
            i--;
        }
        if(i == s.length()-1){
            System.out.println(ch + "" + count);
        }
    }

    
  }
}
