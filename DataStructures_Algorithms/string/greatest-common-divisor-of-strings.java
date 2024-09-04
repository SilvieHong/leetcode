//https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";
        int gcd = gcd(str1.length(), str2.length());
        return str1.substring(0, gcd);
    }

    private static int gcd(int str1, int str2) {
        return str2 == 0 ? str1 : gcd(str2, str1 % str2);
    }
}
