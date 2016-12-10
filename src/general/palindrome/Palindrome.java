package general.palindrome;

import java.util.Stack;

/**
 * Created by simon on 10/12/2016.
 */
public class Palindrome {
    private char[] palindrome;

    public Palindrome(String palindrome){
        this.palindrome = palindrome.toCharArray();
    }

    boolean isPalindrome(){
        int size = palindrome.length;

        for(int i = 0, j = size - 1; i < size; i++, j--){
            if(palindrome[i] != palindrome[j]){
                System.out.println("Not a Palindrome");
                return false;
            }
        }

        System.out.println("Palindrome");
        return true;
    }
}
