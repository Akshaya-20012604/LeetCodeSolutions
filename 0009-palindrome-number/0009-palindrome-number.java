class Solution {
    public boolean isPalindrome(int x) {
        
        String a = String.valueOf(x);
        String temp="";
         
         for(int i=0; i<a.length();i++)
         {
            temp = temp+a.charAt((a.length()-1)-i);
         }
         if(temp.equals(a))
         {
            return true;
         }
         else
         {
            return false;
         }
    }
}