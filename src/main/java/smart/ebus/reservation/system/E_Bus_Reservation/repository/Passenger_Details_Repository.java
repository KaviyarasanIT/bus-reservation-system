package smart.ebus.reservation.system.E_Bus_Reservation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Details_Entity;

@Repository
public interface Passenger_Details_Repository extends JpaRepository<Passenger_Details_Entity,String> {
}
