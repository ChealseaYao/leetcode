package string;

public class repeatedSubstringPattern {
    public static void main(String[] args) {

    }

    public static boolean repeatedSubstringPattern(String s) {
        int n= s.length();
        int[] next = new int[n];
        next[0] = 0;
        int j = 0;

        for (int i = 1; i < n; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;

        }
        if (next[n - 1] > 0 && n % (n - next[n - 1]) == 0) { // 当字符串s的长度可以被其最长相等前后缀不包含的子串的长度整除时
            return true; // 不包含的子串就是s的最小重复子串
        } else {
            return false;
        }

    }
}
