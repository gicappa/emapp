package application;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class MainIT {

    @Test
    void it_should() {
        System.out.println("-> INTEGRATION <-");
        assertThat(2).isEqualTo(2);
    }

}
