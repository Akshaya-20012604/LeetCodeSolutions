class Solution {
    public int findNthDigit(int n) 
    {
        long digits = 0;
        long power = 1;
        if(n <= 9)
        {
            return n;
        }
        while(digits + (9* (long)Math.pow(10 , power - 1)* power) <= n)
        {
            digits += (9* (long)Math.pow(10 , power - 1)* power);
            power++;
        }
        
        long quotient = (n - digits) / power;
        long mod = ( n - digits) % power;
        long i = mod == 0 ? (quotient + (long)Math.pow(10 , power-1)-1) :(quotient + (long)Math.pow(10 , power-1));
        String num = String.valueOf(i);
        return mod == 0 ? Character.digit(num.charAt(num.length()-1),10) : Character.digit(num.charAt((int)mod-1),10);
    }
}