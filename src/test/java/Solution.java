import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    //https://www.java67.com/2018/04/21-string-programming-and-coding-interview-questions-answers.html
    public String reverseRecursive(String input) {
        return reverseRecursive(input, 0, "");
    }

    private String reverseRecursive(String input, int idx, String result) {
        if (idx >= input.length()) {
            return result;
        } else {
            return reverseRecursive(input, idx + 1, result) + input.charAt(idx);
        }
    }

    public String reverseTwoPointer(String input) {
        int s = 0;
        int e = input.length() - 1;
        final char[] out = input.toCharArray();
        while (s < e) {
            final char temp = out[s];
            out[s] = out[e];
            out[e] = temp;
            s++;
            e--;
        }
        return String.valueOf(out);
    }

    //List.of("ABC", "BAC", "CAB", "CBA")
    public Set<String> permutation(String input) {
        Set<String> result = new HashSet<>();
        permutation(input, "", new HashSet<>(), result);
        return result;
    }

    private void permutation(String input, String tempResult, Set<Integer> used, Set<String> result) {
        if (used.size() == input.length()) {
            result.add(String.valueOf(tempResult));
        }
        for (int i = 0; i < input.length(); i++) {
            if (!used.contains(i)) {
                used.add(i);
                permutation(input, tempResult + input.charAt(i), used, result);
                used.remove(i);
            }
        }
    }

    //    "JAVA"
    public char firstNonRepeat(String input) {
        final LinkedHashSet<Character> linkedHashSet = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            if (linkedHashSet.contains(c)) {
                linkedHashSet.remove(c);
            } else {
                linkedHashSet.add(c);
            }
        }
        return linkedHashSet.iterator().next();
    }

}
