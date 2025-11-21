class Solution {
    public int myAtoi(String s) {
        if(s == null || s.isEmpty()) return 0;
		
        s = s.trim();
		int sign = 1, i = 0;
		long res = 0;
		
		// check signs first, then add digits to a number
		if(i < s.length() && (s.charAt(i)=='+' || s.charAt(i)=='-'))
			{
                sign = (s.charAt(i)=='-')?-1:1;
		        i++;
            }
		
		//add digits to the result
		while(i<s.length() && Character.isDigit(s.charAt(i)))
		{
			res = res * 10 + (s.charAt(i) - '0');
		
			if(sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
			if(sign == -1 && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
		}
		return (int)(res*sign);
      		
    }
}