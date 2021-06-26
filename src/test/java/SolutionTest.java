import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void reverse() {
        assertThat(new Solution().reverseRecursive("123456789")).isEqualTo("987654321");
        assertThat(new Solution().reverseTwoPointer("123456789")).isEqualTo("987654321");
    }

    @Test
    void permutation() {
        assertThat(new Solution().permutation("ABC")).containsExactlyInAnyOrderElementsOf(
                List.of("ABC", "ACB", "BAC", "BCA", "CAB", "CBA")
        );
    }

    @Test
    void firstNonRepeat() {
        assertThat(new Solution().firstNonRepeat("JAVA")).isEqualTo('J');
        assertThat(new Solution().firstNonRepeat("JAVAJ")).isEqualTo('V');
    }
}
