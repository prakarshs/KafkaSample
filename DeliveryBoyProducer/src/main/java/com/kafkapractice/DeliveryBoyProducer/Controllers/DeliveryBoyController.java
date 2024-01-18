package com.kafkapractice.DeliveryBoyProducer.Controllers;

import com.kafkapractice.DeliveryBoyProducer.Services.DeliveryBoyServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/delivery")
public class DeliveryBoyController {

    @Autowired
    private DeliveryBoyServiceIMPL deliveryBoyServiceIMPL;

    @PutMapping("/update")
    private ResponseEntity<String> updateLocation() throws InterruptedException {
        int i = 10;
        while(i > 0)
        {
            deliveryBoyServiceIMPL.updateLocation(Math.random() + " , " + Math.random());
            Thread.sleep(1400);
            i--;
        }

        return new ResponseEntity<>("location updated",HttpStatus.OK);
    }
}
