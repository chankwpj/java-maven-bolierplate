import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Solution {

    //https://www.geeksforgeeks.org/lexicographically-smallest-array-k-consecutive-swaps/

    public int[] solution(int[] input, int k) {
        int pos = 0;
        int min = input[pos];
        int idxMin = pos;
        while (k > 0 && pos < input.length) {
            for (int i = pos + 1; i <= pos + k && i < input.length; i++) {
                if (input[i] < min) {
                    min = input[i];
                    idxMin = i;
                }
            }
            int step = swapTo(pos, idxMin, input);
            k -= step;
            pos++;
            min = input[pos];
        }
        return input;
    }

    private int swapTo(final int pos, int idx, final int[] input) {
        int step = 0;
        while (pos < idx) {
            int temp = input[idx - 1];
            input[idx - 1] = input[idx];
            input[idx] = temp;
            idx --;
            step ++;
        }
        return step;
    }

}
