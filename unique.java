import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        String ch = "";
        for (int i = 0; i < s.length(); i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    isUnique = false; 
                    break;
                }
            }
            if (isUnique) {
                ch += s.charAt(i);
            }
        }
        System.out.println(ch);
    
    }
}
