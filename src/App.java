/* Complete methods: firstTwoSum and __________. 
 * DO NOT MODIFY THE MAIN METHOD!
 *
 *Array task: Complete the method firstTwoSum. 
 *
 * This method:
 *  -takes in an array of integers that will have a length. 
 *  -If the array has a length of 2 or more, return the sum of the first values
 *  -If the array has a length of 1, just return that value
 *  -If the array has a length of 0, return 0.
 *  
 * An example of this method working is included in the main method
 * 
 * 
 *Split task: Complete the method minWordLength
 * 
 * This method:
 *  -takes in a sentence stored in a String  
 *  -returns the length of the shortest word in that String
 *  
 * Remember that you can use .length() to find the length of a word
 * 
 * An example of this method working is included in the main method 
*/

public class App {
    public static void main(String[] args) {
        // firstTwoSum example
        System.out.println("With input [1, 2, 3], you should get: 3. You got: " + firstTwoSum(new int[] { 1, 2, 3 }));
        System.out.println("With input [5, 6, 9, 2], you should get: 11. You got: " + firstTwoSum(new int[] { 5,6,9,1 }));
        System.out.println("With input [7], you should get: 7. You got: " + firstTwoSum(new int[] { 7 }));
        System.out.println("With input [], you should get: 0. You got: " + firstTwoSum(new int[] {}));

        System.out.println("should return 1. You got: " + minWordLength("The Man was there a while ago"));
        System.out.println(" you should get: 6. You got: " + firstTwoSum(new int[] {3,3, 1, 2, 3 }));


        // minWordLength example/
        System.out.println("With input \"Java is fun\" you should return 2. You got: " + minWordLength("Java is fun"));
        System.out.println(
                "With input \"Java isn't scary\" you should return 4. You got: " + minWordLength("Java isn't scary"));
        System.out.println(
                "With input \"I can do this\" you should return 1. You got: " + minWordLength("I can do this"));

    }

    public static int firstTwoSum(int[] nums) {
        switch (nums.length) {
            case 0:
                return 0;
            case 1:
                return nums[0];
            default:
                return nums[0] + nums[1];        }
    }

    public static int minWordLength(String sentence) {
        String[] pieces = sentence.split(" ");
        int shortest = 999;

        for (int i = 0; i < pieces.length; i++) {
            int wordLength = pieces[i].split("").length;
            if (shortest > wordLength) {
                shortest = wordLength;
            }
        }
        return shortest;
    }
}
