package general.anagram;

/**
 * Created by simon on 10/12/2016.
 */
public class AnagramTest {

    public static void main(String[] args){
        Anagram anagram1 = new Anagram("anagramm");
        anagram1.isAnagram("marganaa");

        Anagram anagram2 = new Anagram("anagram");
        anagram2.isAnagram("margana");
    }
}
