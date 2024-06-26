//https://leetcode.com/problems/number-complement/
class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (char ch : binary.toCharArray()) {
            switch(ch){
                case '0':
                    sb.append('1');
                    break;
                case'1':
                    sb.append('0');
                    break;
            }
        }
        return Integer.parseInt(sb.toString(),2);
    }
}
/**
 * Complexity:
 * Time:O(logn) and Space:O(logn)
 */
