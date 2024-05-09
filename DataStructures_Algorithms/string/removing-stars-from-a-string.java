//https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String removeStars(String s) {
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!= '*'){
                sb.append(s.charAt(i));
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
