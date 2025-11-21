class Solution {
    public int minOperations(String[] logs) {
        int child = 0;
		for(String s : logs)
		{
		   if(s.equals("../"))
			{
				if(child>0 )
				{
					child--;
				}
			}
			else if(logs.length > 0 && s.equals("./"))
			{
				child = child;
			}
			else
			{
				child++;
			}
		}
		if(child < 0)
		{
			return 0;
		}
		else
		{
			return child;
		}
    }
}