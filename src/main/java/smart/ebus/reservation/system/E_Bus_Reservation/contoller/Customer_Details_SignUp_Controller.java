package smart.ebus.reservation.system.E_Bus_Reservation.contoller;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Login_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.request.Sign_Up_Request;
import smart.ebus.reservation.system.E_Bus_Reservation.model.response.Response;
import smart.ebus.reservation.system.E_Bus_Reservation.service.Customer_Details_Service;

@RestController
@RequestMapping("/customer_details/")
public class Customer_Details_SignUp_Controller {
    @Autowired
    Customer_Details_Service customer_details_service;

    @Operation(summary = "Sign Up process",description = "Taking user id, first name, last name, gender, date of birth, " +
            "place, aadhar number, phone number, security question 1, security answer 1, security question 2, security answer 2 " +
            "and password then create an account for the new user and then return back to the login page.",tags = "Post")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200",description = "Creating account",
                    content = {@Content(mediaType = "application/json",
                            schema = @Schema(implementation = Sign_Up_Request.class))}),
            @ApiResponse(responseCode = "404",description = "User Not Found",
                    content = @Content)
    })
    @PostMapping("sign_up_page/")
    public ResponseEntity<Response> new_customer_details(@RequestBody Sign_Up_Request sign_up_request)
    {
        return new ResponseEntity<Response>(customer_details_service.customer_details(sign_up_request), HttpStatus.ACCEPTED);
    }
}
