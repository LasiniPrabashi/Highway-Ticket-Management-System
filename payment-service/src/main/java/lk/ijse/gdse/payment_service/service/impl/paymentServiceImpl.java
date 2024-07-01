package lk.ijse.gdse.payment_service.service.impl;

import lk.ijse.gdse.payment_service.dto.paymentDTO;
import lk.ijse.gdse.payment_service.entity.payment;
import lk.ijse.gdse.payment_service.repo.paymentRepo;
import lk.ijse.gdse.payment_service.service.paymentService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class paymentServiceImpl implements paymentService {

    @Autowired
    private paymentRepo repo;

    @Autowired
    private ModelMapper mapper;


    @Override
    public paymentDTO savePayment(paymentDTO dto) {
        if (repo.existsById(dto.getId())){
            new RuntimeException("all ready exits");
        }
        return mapper.map(repo.save(mapper.map(dto, payment.class)),paymentDTO.class);
    }

    @Override
    public paymentDTO updatePayment(paymentDTO dto) {
        if (repo.existsById(dto.getId())){
            new RuntimeException("all ready exits");
        }
        return mapper.map(repo.save(mapper.map(dto, payment.class)),paymentDTO.class);
    }

    @Override
    public List<paymentDTO> getAllPayment() {
        return mapper.map(repo.findAll(), new TypeToken<ArrayList<paymentDTO>>() {
        }.getType());
    }
}
