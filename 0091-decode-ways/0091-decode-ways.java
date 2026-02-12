class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0) return 0;

        int n = s.length();

        int prev2 = 1;  
        int prev1 = (s.charAt(0) != '0') ? 1 : 0;

        for (int i = 2; i <= n; i++) {
            int curr = 0;

            char one = s.charAt(i - 1);
            if (one != '0') {
                curr += prev1;
            }

            int two = Integer.parseInt(s.substring(i - 2, i));
            if (two >= 10 && two <= 26) {
                curr += prev2;
            }

            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;  
    }
}