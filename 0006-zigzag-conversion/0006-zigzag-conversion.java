class Solution {
    public String convert(String s, int numRows) {

      if(s.length() <= numRows || numRows == 1)
			return s;
		
		List<StringBuilder> rows = new ArrayList<>();
		
		for(int i=0; i<numRows; i++)
		{
			rows.add(new StringBuilder());
		}
		
		int currRow = 0;
		boolean downflg = false;
		
		for(char c : s.toCharArray())
		{
			rows.get(currRow).append(c);
				
			if(currRow == 0 || currRow == numRows-1)
			{
				downflg = !downflg;
			}
			
			if(downflg)
			{
				currRow++;
			}
			else
			{
				currRow--;
			}
		}
		
		StringBuilder result = new StringBuilder();
		
		for(StringBuilder row : rows)
		{
			result.append(row);
		}
		
		return result.toString();
		
		
	}
}
