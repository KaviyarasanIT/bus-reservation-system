package smart.ebus.reservation.system.E_Bus_Reservation.service;

import smart.ebus.reservation.system.E_Bus_Reservation.entity.Passenger_Journey_Details_Entity;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Getting_Journey_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.entity.Journey_Details_Entity;

public interface Passenger_Journey_Details_Service {
    Passenger_Journey_Details_Entity customer_details(Getting_Journey_Request getting_journey_request);
}
