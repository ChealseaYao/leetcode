package string;

public class reverseWords {
    public static void main(String[] args) {
        String s = "the sky is blue  ";
        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        StringBuilder sb = removeSpace(s);
        reverseStr(sb, 0, sb.length() - 1);
        reverseWord(sb);

        return sb.toString();


    }


    private static StringBuilder removeSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        int end = s.length() - 1;

        while (start <= end && s.charAt(start) == ' ') start++;
        while (start <= end && s.charAt(end) == ' ') end--;

        while (start <= end) {
            char c = s.charAt(start);
            int length = sb.length();
            if (c != ' ' || sb.charAt(length - 1) != ' ') {
                sb.append(c);
            }
            start++;
        }
        return sb;
    }

    private static void reverseStr(StringBuilder sb, int start, int end) {
        while (start <= end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }

    private static void reverseWord(StringBuilder sb) {
        int start = 0;
        int end = 1;
        int n = sb.length();
        while (start < n) {
            while (end < n && sb.charAt(end) != ' ') {
                end++;
            }
            reverseStr(sb, start, end - 1);
            start = end + 1;
            end = start + 1;

        }


    }
}
