class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
List<Integer> list = new ArrayList<Integer>();
		Arrays.sort(nums);
		int[] count = new int[nums.length+1];
		for(int i : nums)
		{
			count[i]++;		
		}
		
		for(int i = 1; i<=nums.length;i++)
		{
			if(count[i]==0)
			{
				list.add(i);
			}
		}
		return list;
    }
}