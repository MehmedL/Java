public class Main {

    public static void main(String[] args) {
        String s = "babadasdergtbaab";
        System.out.println("Longest Palindromic Substring: " + longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            // Expand around center for odd length palindrome
            int len1 = expandAroundCenter(s, i, i);
            // Expand around center for even length palindrome
            int len2 = expandAroundCenter(s, i, i + 1);

            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    // Function to expand around the center and find palindrome length
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // length of the palindrome
    }
}