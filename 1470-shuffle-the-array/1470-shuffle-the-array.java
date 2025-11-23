class Solution {
    public int[] shuffle(int[] nums, int n) {
        int res[] = new int[nums.length];
		int arr1[] = new int[n];
		int arr2[] = new int[n];
		int temp = n;
		for(int i = 0 ; i<n;i++)
		{
			arr1[i] = nums[i];
		}
		for(int i = 0 ; i<n;i++)
		{
			arr2[i] = nums[temp];
			temp++;
		}
		
		int c1 = 0, c2 =0;
		for(int i=0; i<res.length;i++)
		{ 
			if(i%2==0)
			{
				res[i] = arr1[c1];
				c1++;
			}
			else
			{
				res[i] = arr2[c2];
				c2++;
			}
		}
				
		return res;
    }
}