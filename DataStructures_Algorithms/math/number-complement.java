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
 * Time:O(n) and Space:O(n)
 */





//https://leetcode.com/problems/number-complement/solutions/3993385/easy-solution-with-explanation-2-approaches-without-bit-manipulation-beats-100/
class betterSolution {
    public int findComplement(int num) {
	    return ~num & (Integer.highestOneBit(num) - 1);
    }
}
/**
 * Complexity:
 * Time:O(1) and Space:O(1)
 */
