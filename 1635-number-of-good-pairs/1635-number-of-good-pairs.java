class Solution {
    public int numIdenticalPairs(int[] nums)
    {
        int c[] = new int[102];

        for(int num : nums)
        {
            c[num]++;
        }

    int total=0;
        for(int i : c)
        {
            total += ((i)*(i-1))/2;
        }
        return total;
    }
}