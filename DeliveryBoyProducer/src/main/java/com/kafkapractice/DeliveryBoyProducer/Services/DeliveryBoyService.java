package com.kafkapractice.DeliveryBoyProducer.Services;

import com.kafkapractice.DeliveryBoyProducer.Constants.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DeliveryBoyService implements DeliveryBoyServiceIMPL {
    @Autowired
    private KafkaTemplate<String,Object> kafkaTemplate;
    @Override
    public void updateLocation(String location) {
        kafkaTemplate.send(AppConstants.DELIVERY_LOCATION,location);
    }
}
