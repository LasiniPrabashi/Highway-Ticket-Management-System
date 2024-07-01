package lk.ijse.gdse.payment_service.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class paymentDTO {
    private String id;
    private String ticketNum;
    private double amount;
    private Date purchasedDate;
    private String paymentType;


}
