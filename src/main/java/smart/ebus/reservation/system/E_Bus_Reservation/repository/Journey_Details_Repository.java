package smart.ebus.reservation.system.E_Bus_Reservation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;

@Repository
public interface Journey_Details_Repository extends JpaRepository<Journey_Details_Entity,String> {
}
