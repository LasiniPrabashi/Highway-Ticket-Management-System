package lk.ijse.gdse.vehicle_service.repository;

import lk.ijse.gdse.vehicle_service.entity.vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vehicleRepo extends JpaRepository<vehicle,String> {
}
