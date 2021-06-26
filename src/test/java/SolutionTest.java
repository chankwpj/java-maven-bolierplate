import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t1() {
        assertThat(new Solution().solution()).isEqualTo("123");
    }
}
