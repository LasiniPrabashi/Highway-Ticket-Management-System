package lk.ijse.gdse.payment_service.controller;

import lk.ijse.gdse.payment_service.dto.paymentDTO;
import lk.ijse.gdse.payment_service.service.paymentService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class paymentController {

    @Autowired
    private paymentService service;

    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public List<paymentDTO> getAllPayment() {
        return service.getAllPayments();
    }

    @PostMapping
    public void savePayment(@RequestBody paymentDTO dto) {
        service.savePayment(dto);
    }

    @PatchMapping
    public void updatePayment( @RequestBody paymentDTO paymentDTO){
        service.updatePayment(paymentDTO);
    }

}
