package string;

public class strStr {
    public static void main(String[] args) {
        String str = "sadbutsad";
        String str2 = "sad";
        System.out.println(strStr(str, str2));

    }

    public static int strStr(String haystack, String needle) {
        int n = needle.length();
        int[] next = getNext(needle);
        int j = 0;

        for (int i = 0; i < haystack.length(); i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = next[j - 1]; //不匹配的时候移动子字符串的位置
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == n) {
                return i - j + 1; //此时i的位置在最后一个字符
            }
        }
        return -1;
    }

    private static int[] getNext(String s) {
        int[] next = new int[s.length()];
        int j = 0; //前缀
        next[0] = 0;
        for (int i = 1; i < next.length; i++) {
            while (j > 0 && s.charAt(i) != s.charAt(j)) {
                j = next[j - 1];
            }
            if (s.charAt(i) == s.charAt(j)) {
                j++;
            }
            next[i] = j;
        }
        return next;
    }
}
