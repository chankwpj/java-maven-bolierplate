import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SolutionTest {

    @Test
    void t1() {
        assertThat(new Solution().findWordV1(new String[]{"P>E","E>R","R>U"})).isEqualTo("PERU"); // PERU
    }

    @Test
    void t2() {
        assertThat(new Solution().findWordV1(new String[]{"P>A","S>P", "I>N","A>I"})).isEqualTo("SPAIN"); // SPAIN
    }

    @Test
    void t3() {
        assertThat(new Solution().findWordV1(new String[]{"U>N", "G>A", "R>Y", "H>U", "N>G", "A>R"})).isEqualTo("HUNGARY"); // HUNGARY
    }

    @Test
    void t4() {
        assertThat(new Solution().findWordV1(new String[]{"I>F", "W>I", "S>W", "F>T"})).isEqualTo("SWIFT"); // SWIFT
    }

    @Test
    void t5() {
        assertThat(new Solution().findWordV1(new String[]{"R>T", "A>L", "P>O", "O>R", "G>A", "T>U", "U>G"})).isEqualTo("PORTUGAL"); // PORTUGAL
    }

    @Test
    void t6() {
        assertThat(new Solution().findWordV1(new String[]{"W>I", "R>L", "T>Z", "Z>E", "S>W", "E>R", "L>A", "A>N", "N>D", "I>T"})).isEqualTo("SWITZERLAND"); // SWITZERLAND
    }
}
