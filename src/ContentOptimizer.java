public class ContentOptimizer {

    // Method to reverse a string using recursion
    public static String reverseString(String str) {
        // Base case: if the string is empty or has one character
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }
        // Recursive case: return the last character + the result of reversing the rest of the string
        return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
    }

    public static void main(String[] args) {
        // Test the reverseString method
        String original = "ContentOptimizer";
        String reversed = reverseString(original);

        // Print the results
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}
