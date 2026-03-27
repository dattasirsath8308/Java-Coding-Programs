
public class AddTwoString {
    public static void main(String[] args) {
        String s1 = "12345678910";
        String s2 = "12345678910";
        
        String result = addStrings(s1, s2);
        System.out.println("Result: " + result);
    }
    
    public static String addStrings(String s1, String s2) {
        // Initialize variables
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int len1 = s1.length();
        int len2 = s2.length();
        int maxLen = Math.max(len1, len2);
        
        // Iterate from the end of both strings
        for (int i = 0; i < maxLen; i++) {
            int num1 = i < len1 ? s1.charAt(len1 - 1 - i) - '0' : 0;
            int num2 = i < len2 ? s2.charAt(len2 - 1 - i) - '0' : 0;
            int sum = num1 + num2 + carry;
            
            // Append the digit to the result
            result.append(sum % 10);
            carry = sum / 10;
        }
        
        // If there's a carry left, append it to the result
        if (carry > 0) {
            result.append(carry);
        }
        
        // The result is in reverse order, so reverse it back
        return result.reverse().toString();
    }
}
