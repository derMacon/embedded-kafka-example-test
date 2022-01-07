package de.dps.embeddedkafkatest.kafka;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

@RunWith( SpringRunner.class )
@SpringBootTest
@DirtiesContext
@EmbeddedKafka(partitions = 1,
        topics = {de.dps.embeddedkafkatest.kafka.ReceiverTest.HELLOWORLD_TOPIC})
public class ReceiverTest {

    static final String HELLOWORLD_TOPIC = "helloworld.t";

    @Autowired
    private Receiver receiver;

    @Autowired
    private Sender sender;


    @Test
    public void test() {
        assertTrue(true);
    }


    @Test
    public void testReceive() throws Exception {
        sender.send("Hello Spring Kafka!");

        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
        Assert.assertEquals(receiver.getLatch().getCount(), 0);
    }
}
