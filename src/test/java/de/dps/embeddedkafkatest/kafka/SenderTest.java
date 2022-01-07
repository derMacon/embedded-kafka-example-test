package de.dps.embeddedkafkatest.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
//@RunWith(SpringRunner.class)
@DirtiesContext
public class SenderTest {

    @Test
    public void test() {
        assertTrue(true);
    }

}