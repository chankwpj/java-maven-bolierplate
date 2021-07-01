import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t1() {
        assertThat(new Solution().minDeletions("aab")).isEqualTo(0);
        assertThat(new Solution().minDeletions("aaabbbcc")).isEqualTo(2);
        assertThat(new Solution().minDeletions("aaabbbccfff")).isEqualTo(0);
    }

    @Test
    void containsDuplicate() {
        new Solution().containsDuplicate(new int[]{1,2,3,1});
    }
}
