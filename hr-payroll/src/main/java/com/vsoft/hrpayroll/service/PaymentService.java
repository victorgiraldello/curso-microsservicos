package com.vsoft.hrpayroll.service;

import com.vsoft.hrpayroll.entities.Worker;
import com.vsoft.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vsoft.hrpayroll.entities.Payment;


@Service
public class PaymentService {

   @Autowired
   private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
