package com.kafkapractice.CustomerConsumer;

import com.kafkapractice.CustomerConsumer.Constants.AppConstants;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CustomerConsumerService {
    @KafkaListener(topics = AppConstants.DELIVERY_LOCATION,groupId = "customer-01")
    private void CustomerDisplay(String receivedLocation){
        System.out.println(receivedLocation);
    }
}
