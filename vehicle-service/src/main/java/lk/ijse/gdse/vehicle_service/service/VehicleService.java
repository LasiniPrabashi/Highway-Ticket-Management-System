package lk.ijse.gdse.vehicle_service.service;

import lk.ijse.gdse.vehicle_service.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {

    VehicleDTO saveVehicle(VehicleDTO dto);
    VehicleDTO updateVehicle(VehicleDTO dto);
    List<VehicleDTO> getAllVehicle();
}
