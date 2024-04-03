// https://leetcode.com/problems/jewels-and-stones/
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt = 0;

        char[] num = new char[jewels.length()];
        for (int i = 0; i < jewels.length(); i++) {
            num[i] = jewels.charAt(i);
        }

        for (int i = 0; i < stones.length(); i++) {
            for(int j=0; j<jewels.length(); j++){
                if(stones.charAt(i)==num[j]){
                    cnt++;
                }
            }
        }

        return cnt;
    }
}

/**
 * Complexity:
 * Time:O(n^2) and Space:O(n)
 */
