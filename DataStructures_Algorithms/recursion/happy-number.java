//https://leetcode.com/problems/happy-number/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public int nextNumber(int n){
        int newNum = 0;
        while(n!=0){
            int num = n%10;
            newNum += num*num;
            n/=10;
        }
        return newNum;
    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=nextNumber(n);
        }
        return n==1;
    }
   
}
/**
 * Complexity:
 * Time:O(logn) and Space:O(1)
 */
