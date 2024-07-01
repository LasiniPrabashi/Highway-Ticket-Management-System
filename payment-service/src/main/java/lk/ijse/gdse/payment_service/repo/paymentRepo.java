package lk.ijse.gdse.payment_service.repo;

import lk.ijse.gdse.payment_service.entity.payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface paymentRepo extends JpaRepository<payment, String> {
}
