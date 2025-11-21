class Solution {
    public int calPoints(String[] operations) {
               List<Integer> l1 = new ArrayList<Integer>();
       int res = 0;
        
        for(String s : operations)
        {
        	int len = l1.size();
        	if(s.equals("C"))
        	{
        		l1.remove(len -1);
        	}
        	else if(s.equals("D"))
        	{
        		int doub = l1.get(len-1)*2;
        		l1.add(doub);
        	}
        	else if(s.equals("+"))
        	{
        		int sum = l1.get(len-1) + l1.get(len-2);
        		l1.add(sum);
        	}
        	else
        	{
        		l1.add(Integer.parseInt(s));
        	}
        	
        }
        
        for(int n : l1)
        {
        	res += n;
        }
        
		return res;
    }
}