package smart.ebus.reservation.system.E_Bus_Reservation.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "login_table")
@Data
public class Login_Table_Entity {
    @Id
    @Column(nullable = false)
    private String user_email_id;
    @Column(nullable = false)
    private String user_password;
    @Column(nullable = true)
    private Date login_time;
    @Column(nullable = true)
    private Date logout_time;
}
