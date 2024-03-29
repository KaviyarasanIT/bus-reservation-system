package smart.ebus.reservation.system.E_Bus_Reservation.entity;

import lombok.Data;
import smart.ebus.reservation.system.E_Bus_Reservation.enum_package.Response_Enum;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "passenger_journey_details")
@Data
public class Passenger_Journey_Details_Entity {
    @Id
    private String user_email_id;
    @JoinColumn(name = "user_email_id")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Journey_Details_Entity> journey_detailEntities;
    @Column(nullable = true)
    private String response;
}


