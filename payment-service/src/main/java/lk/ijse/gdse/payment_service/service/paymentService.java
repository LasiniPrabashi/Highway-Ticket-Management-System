package lk.ijse.gdse.payment_service.service;

import lk.ijse.gdse.payment_service.dto.paymentDTO;

import java.util.List;

public interface paymentService {

    paymentDTO savePayment(paymentDTO dto);
    paymentDTO updatePayment(paymentDTO dto);
    List<paymentDTO> getAllPayment();
}
