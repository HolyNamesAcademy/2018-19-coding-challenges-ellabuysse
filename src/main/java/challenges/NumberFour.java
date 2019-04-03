package challenges;

public class NumberFour {

    /**
     * A left rotation operation on an array shifts each of the array's elements to the left the specified number of
     * times. For example, if leftRotation is called with 2 rotations on array [1, 2, 3, 4, 5], then the array would
     * become [3, 4, 5, 1, 2].
     *
     * Given an array of integers and a number, rotations, return an array after the left rotations have occurred.
     * @param input - the array of integers to rotate
     * @param rotations - the number of left rotations to perform
     * @return an array with the specified number of left rotations performed
     */
    public int[] leftRotation(int[] input, int rotations) {
        // Delete the line below and implement the method!
        while(rotations > 0)
            input[input.length-1] = input[0];
            for(int i = 0; i < input.length-1; i++) {
                for (int n = 1; n < input.length-1; n++) {
                    input[i] = input[n];
                }
            }

            rotations--;
        return input;

    }
}
