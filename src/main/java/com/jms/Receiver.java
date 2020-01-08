package com.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class Receiver {

    private static final Logger LOG = LoggerFactory.getLogger(Receiver.class);



    /**
     *
     * @param hello
     * @throws IOException
     */
    @RabbitListener(queues = "hello")
    public void process(Message hello) throws IOException {


        try {
            String body = new String(hello.getBody(), "UTF-8");
            LOG.info(body);
        } catch (Exception e) {
            LOG.error("member.browse_unpaid. Receiver error.", e);
        }
    }

}