import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    Solution s = new Solution();

    @Test
    void t1() {
        final int[] input = {7, 6, 9, 2, 1};
        final int k = 3;
        assertThat(s.solution(Arrays.copyOf(input, input.length), k)).isEqualTo(GFG.minimizeWithKSwaps(Arrays.copyOf(input, input.length), input.length, k));
    }

    @Test
    void t2() {
        final int[] input = {7, 6, 9, 2, 1};
        final int k = 1;
        assertThat(s.solution(Arrays.copyOf(input, input.length), k)).isEqualTo(GFG.minimizeWithKSwaps(Arrays.copyOf(input, input.length), input.length, k));
    }

    @Test
    void t3() {
        final int[] input = {7, 1, 6, 2, 3};
        final int k = 3;
        assertThat(s.solution(Arrays.copyOf(input, input.length), k)).isEqualTo(GFG.minimizeWithKSwaps(Arrays.copyOf(input, input.length), input.length, k));
    }

}
