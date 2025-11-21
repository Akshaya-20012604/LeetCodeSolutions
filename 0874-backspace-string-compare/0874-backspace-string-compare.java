class Solution {
    public boolean backspaceCompare(String s, String t) {
		StringBuilder s1  = new StringBuilder();
		for(char c : s.toCharArray())
		{
			int l1 = s1.length();
			 if (c == '#') 
			    {
	                if (s1.length() > 0)
	                    s1.deleteCharAt(l1 - 1);
	            } 
			 else 
			 	{
	                s1.append(c);
	            }
		}
		
		StringBuilder s2  = new StringBuilder();
		for(char c : t.toCharArray())
		{
			int l2 = s2.length();
			 if (c == '#') {
	                if (s2.length() > 0)
	                    s2.deleteCharAt(l2 - 1);
	            } else {
	                s2.append(c);
	            }
		}

		if(s1.toString().equals(s2.toString()))
		{
			return true;
		}
		else
		{
			return false;
		}
    }
}