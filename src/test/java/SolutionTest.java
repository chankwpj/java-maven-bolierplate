import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t1() {
        assertThat(new Solution().solution(
                5, 3,
                new int[]{1, 1, 4, 1, 4},
                new int[]{5, 2, 5, 5, 4},
                new int[]{1, 2, 2, 3, 3}
        )).isEqualTo(3);
    }

    @Test
    void t2() {
        assertThat(new Solution().solution(
                6, 4,
                new int[]{1, 2, 1, 1},
                new int[]{3, 3, 6, 6},
                new int[]{1, 2, 3, 4}
        )).isEqualTo(2);
    }

    @Test
    void t3() {
        assertThat(new Solution().solution(
                5, 2,
                new int[]{1, 1, 2},
                new int[]{5, 5, 3},
                new int[]{1, 2, 1}
        )).isEqualTo(3);
    }


    @Test
    void t4() {
        assertThat(new Solution().solution(
                15, 1,
                new int[]{1, 1, 4, 1, 4},
                new int[]{5, 2, 5, 5, 4},
                new int[]{1, 2, 2, 3, 3}
        )).isEqualTo(0);
    }

    @Test
    void t5() {
        assertThat(new Solution().solution(
                5, 1,
                new int[]{1, 2, 4, 3, 4},
                new int[]{1, 5, 5, 5, 4},
                new int[]{1, 2, 2, 3, 3}
        )).isEqualTo(1);
    }

}
