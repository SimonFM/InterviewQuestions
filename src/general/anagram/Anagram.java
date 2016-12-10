package general.anagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by simon on 10/12/2016.
 */
public class Anagram {
    private String anagram;
    private Map occurences;

    public Anagram(String anagram){
        this.anagram = anagram;
        this.occurences = new HashMap<Character, Integer>();
        initiliaseMap();
    }
    
    private void initiliaseMap(){
        for (char c: anagram.toCharArray()) {
            Integer value = (occurences.containsKey(c))? (Integer) occurences.get(c) + 1 : 1;
            occurences.put(c, value);
        }
    }

    public boolean isAnagram(String a){
        if(anagram == null || a == null){
            System.out.println("Not an Anagram - null");
            return false;
        }

        if(anagram.length() != a.length()){
            System.out.println("Not an Anagram - size is different!");
            return false;
        }

        for (char c : a.toCharArray()) {
            Integer value = (Integer) occurences.get(c);
            occurences.put(c, value - 1);
        }

        Set<Map.Entry<Character, Integer>> entrySet = occurences.entrySet();

        for (Map.Entry key : entrySet) {
            Integer value = (Integer) key.getValue();
            if(value != 0){
                System.out.println("Not an Anagram");
                return false;
            }
        }

        System.out.println("Anagram");
        return true;
    }
}
