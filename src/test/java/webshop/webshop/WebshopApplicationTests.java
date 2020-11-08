package webshop.webshop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class WebshopApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void add() {
        assertEquals(15,10+5);
    }

}
