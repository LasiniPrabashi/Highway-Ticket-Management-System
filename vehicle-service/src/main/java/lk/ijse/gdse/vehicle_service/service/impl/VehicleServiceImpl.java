package lk.ijse.gdse.vehicle_service.service.impl;

import lk.ijse.gdse.vehicle_service.dto.VehicleDTO;
import lk.ijse.gdse.vehicle_service.service.VehicleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {
    @Override
    public VehicleDTO saveVehicle(VehicleDTO dto) {
        return null;
    }

    @Override
    public VehicleDTO updateVehicle(VehicleDTO dto) {
        return null;
    }

    @Override
    public List<VehicleDTO> getAllVehicle() {
        return null;
    }
}
