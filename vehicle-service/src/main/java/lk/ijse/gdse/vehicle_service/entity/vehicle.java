package lk.ijse.gdse.vehicle_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class vehicle {
    @Id
    private String id;
    private String name;
    private String model;
    private String number;
}
