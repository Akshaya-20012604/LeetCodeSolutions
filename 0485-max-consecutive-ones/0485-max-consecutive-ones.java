class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
    int max = 0,cnt = 0;
		for(int  i : nums)
		{
			if(i==1)
			{
				cnt++;
				max = Math.max(max, cnt);
			}
			else
			{
				cnt = 0;
			}
		}

		return max;
    }
}