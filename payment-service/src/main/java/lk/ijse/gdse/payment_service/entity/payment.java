package lk.ijse.gdse.payment_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class payment {
    @Id
    private String paymentId;
    private String ticketNum;
    private double amount;
    private Date purchasedDate;
    private String paymentType;
}
