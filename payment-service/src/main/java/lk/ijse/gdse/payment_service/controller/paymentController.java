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
        return service.getAllPayment();
    }

    @PostMapping
    public paymentDTO savePayment(@RequestBody paymentDTO dto){
        return service.savePayment(dto);
    }

    @PutMapping
    public paymentDTO updateTicket(@RequestBody paymentDTO dto){
        return service.updatePayment(dto);
    }
}
