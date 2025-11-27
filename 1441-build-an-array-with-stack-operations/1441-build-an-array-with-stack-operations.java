class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> result = new ArrayList<>();

         int pointer = 0; 

         for (int num = 1; num <= n; num++) {

             if (pointer == target.length) {
                 break; 
             }

             if (num == target[pointer]) {
                 result.add("Push");
                 pointer++;
             } else {
                 result.add("Push");
                 result.add("Pop");
             }
         }

         return result;
    }
}