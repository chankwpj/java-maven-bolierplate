import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t1() {
        assertThat(new Solution().solution()).isEqualTo("123");
    }

    @Test
    void convert() {
        assertThat(new Solution().convert("PAYPALISHIRING", 3)).isEqualTo("PAHNAPLSIIGYIR");
        assertThat(new Solution().convert("A", 2)).isEqualTo("A");
        assertThat(new Solution().convert("AB", 1)).isEqualTo("AB");
    }
}
