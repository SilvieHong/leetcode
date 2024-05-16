//https://leetcode.com/problems/fibonacci-number/
class Solution {
    public int fib(int n) {
        if(n==0||n==1) return n;
        int[] fibonacci = new int[n+1];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i=2; i<n+1; i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci[n];
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */





//https://leetcode.com/problems/fibonacci-number/solutions/329680/here-is-why-this-question-is-kinda-important-and-this-is-what-you-should-take-away/
class betterSolution {
    public int fib(int n) {
        if(n==0||n==1) return n;
        int a=0; b=1;
        int sum=0;

        while(n>1){
          sum=a+b;
          a=b;
          b=sum;
          n-=1;
        }
        return sum;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
