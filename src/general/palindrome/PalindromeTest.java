package general.palindrome;

import general.anagram.Anagram;

/**
 * Created by simon on 10/12/2016.
 */
public class PalindromeTest {

    public static void main(String[] args){
        Palindrome palindrome1 = new Palindrome("madam");
        palindrome1.isPalindrome();

        Palindrome palindrome3 = new Palindrome("Step on no pets");
        palindrome1.isPalindrome();

        Palindrome palindrome2 = new Palindrome("madam1");
        palindrome2.isPalindrome();
    }

}
