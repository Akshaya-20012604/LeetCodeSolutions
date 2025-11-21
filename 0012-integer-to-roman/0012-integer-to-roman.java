class Solution {
    public String intToRoman(int num) {

        StringBuilder res = new StringBuilder();
		
    String[] sym = {"I" , "IV" , "V" , "IX" , "X" , "XL" , "L" , "XC", "C" , "CD" , "D" , "CM" , "M"};
        int[] val = {1,4,5,9,10,40,50,90,100,400,500,900,1000};  
        int i = val.length-1;
        
        while(num > 0 && i >= 0)
        {
        	if(num < val[i])
        	{
        		i-=1;
        	}
        	else
        	{
        		num-=val[i];
        		res.append(sym[i]);
        	}
        }
        return res.toString();
    }
}