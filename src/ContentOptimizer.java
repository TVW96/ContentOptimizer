public class ContentOptimizer {


    public static String stringReversal(String str) {
        // Base case: if the string is empty or has 1 character
        if (str.isEmpty() || str.length() == 1) {
            System.out.println(str);
            return str;
        }
        // Recursive case: return the last character + the result of reversing the rest of the string
        String recursive = str.charAt(str.length() - 1) + stringReversal(str.substring(0, str.length() - 1));
        System.out.println(recursive);
        return recursive;
    }




    public static void main(String[] args) {
        // Test the reverseString method
        String original = "kcablloR";
        String reversed = stringReversal(original);

        // Print the results
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
