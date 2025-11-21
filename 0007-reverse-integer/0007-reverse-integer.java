class Solution {
	    public int reverse(int x) 
	    {
	            int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            
            // Check for overflow before updating the reversed number
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0; // Overflow
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < Integer.MIN_VALUE % 10)) {
                return 0; // Underflow
            }
            
            reversed = reversed * 10 + digit;
        }
        
        return reversed;
    }
	    
	}