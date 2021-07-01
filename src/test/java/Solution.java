import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Solution {
    public int minDeletions(String s) {

        return 0;
    }

    public String restoreString(String s, int[] indices) {
        if (s == null) {
            return null;
        }
        final char[] newString = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            newString[indices[i]] = s.charAt(i);
        }
        return String.valueOf(newString);
    }

    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        for (List<String> i : items) {
            if (ruleKey.equals("type") && i.get(0).equals(ruleValue)) {
                counter++;
            } else if (ruleKey.equals("color") && i.get(1).equals(ruleValue)) {
                counter++;
            } else if (ruleKey.equals("name") && i.get(2).equals(ruleValue)) {
                counter++;
            }
        }
        return counter;
    }

    public void balancedStringSplit(String s, String subResult) {
        Predicate<List> func = (list) -> list.size() == new HashSet(list).size();
        func.test(List.of(1, 2, 3, 4, 5));
        func.test(List.of(1, 1, 2, 2));
    }

    public boolean containsDuplicate(int[] nums) {
//        Arrays.asList(1, 2, 3, 4)
//        Arrays.asList(new char[]{'a'});
        return Arrays.stream(nums).boxed().collect(Collectors.toSet()).size() == nums.length;
    }

    public String defangIPaddr(String address) {
        return address == null ? null : address.replace(".", "[.]");
    }

    //RLRRLLRLRL
    public int balancedStringSplit(String s) {
        int co = 0;
        int out = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                co++;
            }
            if (c == 'R') {
                co--;
            }
            if (co == 0) {
                out++;
            }
        }
        return out;
    }

    public int maxDepth(String s) {
        int count = 0;
        int out = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                out = Math.max(out, count);
            }
            if (c == ')') {
                count--;
            }
        }
        return out;
    }

    public String sortSentence(String s) {
        final String[] sents = s.split(" ");
        Arrays.sort(sents, (s1, s2) -> s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
        StringBuilder stringBuilder = new StringBuilder();
        for (String sent : sents) {
            stringBuilder.append(sent.substring(0, sent.length() - 1) + " ");
        }
        return stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString();
    }

    public boolean checkIfPangram(final String sentence) {
//        return Sets.newHashSet(Arrays.asList(sentence.toCharArray())).size() == 26;
        Set<Character> set = new HashSet<>();
        for (char c : sentence.toCharArray()) {
            set.add(c);
        }
        return set.size() == 26;
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String str : word1) {
            sb1.append(str);
        }
        for (String str : word2) {
            sb2.append(str);
        }
        return sb1.toString().equals(sb2.toString());
    }

    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            set.add(c);
        }
        int out = 0;
        for (String s : words) {
            boolean isConsistent = true;
            for (char c : s.toCharArray()) {
                if (!set.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }
            if (isConsistent) out++;
        }
        return out;
    }

    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        final String[] arr = s.split(" ");
        for (int i = 0; i < k - 1; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        sb.append(arr[k - 1]);
        return sb.toString();
    }

    public String replaceDigits(String s) {
        char[] out = s.toCharArray();
        for (int i = 1; i < s.length(); i += 2) {
                out[i] = (char) (s.charAt(i - 1) + Character.getNumericValue(s.charAt(i)));
        }
        return String.valueOf(out);
    }

    public String removeOuterParentheses(String s) {

    }

}