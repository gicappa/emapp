package application;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void it_should() {
        System.out.println("-> UNIT <-");
        assertThat(2).isEqualTo(2);
    }
}