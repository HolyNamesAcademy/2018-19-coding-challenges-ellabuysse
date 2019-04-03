package challenges;

public class NumberTwo {

    /**
     * Given three numbers, a, b, and c, one is small, one is medium, and one is large. Return
     * true if the three values are evenly spaced, meaning the difference between the small and
     * the medium is the same as the difference between the medium and the large.
     *
     * Example:
     * Given a = 2, b = 4, c = 6
     * Return true
     *
     * Example:
     * Given a = 4, b = 6, c = 2
     * Return true
     *
     * Example:
     * Given a = 5, b = 6, c = 3
     * Return false
     *
     * @return true if the numbers are evenly spaced, otherwise false
     */
    public boolean evenlySpaced(int a, int b, int c){
        // Delete the line below and implement the method!
        int min = Math.min(Math.min(a,b), c);
        int max = Math.max(Math.max(a,b), c);
        int med = a;
        if((min == a || min == b) && (max == a || max == b))
            med = c;
        if((min == a || min == c) && (max == a || max == c))
            med = b;
        if((min == b || min == c) && (max == b || max == c))
            med = a;

        if(max - med == med - min) {
            return true;
        }
        return false;

}}
