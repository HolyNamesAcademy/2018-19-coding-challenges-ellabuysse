package challenges;
import java.util.Arrays;

public class NumberFive {


    /**
     * Two strings, word1 and word2, are called anagrams if they contain all the same characters in the same
     * frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.
     *
     * Example:
     * word 1 - cat
     * word 2 - act
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - acT
     * true
     *
     * Example:
     * word 1 - cat
     * word 2 - actt
     * false
     *
     * Example:
     * word 1 - cat
     * word 2 - acts
     * false
     *
     * @return true if word1 and word2 are case-insensitive anagrams, false otherwise.
     */
    public boolean isAnagram(String word1, String word2) {
        // Delete the line below and implement the method!
        if(word1.length() != word2.length())
            return false;
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        int[] one = new int[word1.length()];
        int[] two = new int[word2.length()];
        for(int i = 0; i < word1.length(); i++){
            one[i] = word1.charAt(i);
            two[i] = word2.charAt(i);}
        Arrays.sort(one);
        Arrays.sort(two);
        for(int i = 0; i < word1.length(); i++){
            if(one[i] != two[i])
                return false;}
        return true;
    }
}
