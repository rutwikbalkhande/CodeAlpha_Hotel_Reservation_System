package com.project;
/*
public class Notes_Important {
	/*    ***   ReservationController *******   method Details
	 { localhost:8080/reservation/ }
##########################################################################################	 
	
	1. getAllReservations()  :=    //display all reserve room details from reservation table 
	
	2. getReservById(@PathVariable int id) := 
	                      get pertiular single customer booking details by using reservationId 
	                                from Table reservation { localhost:8080/reservation/6 } 
	
	3.  createReservation(@RequestBody Reservation reservation) :=
	              for book Room write in postman {post} Reservation Controller class
	          Example=            {
	                        "room":{
		                      "id" :3
		                      },
		                      "guestName": "zzx",
		                       "startDate": "2024-05-28",
		                       "endDate": "2024-06-02",
		                       "paymentStatus": "Pending"
		                     }
		
	4.  public List<Reservation> getBookingDetailsByRoomId(@PathVariable Long roomId)
	           :== Find Room History which perticular room booked. get customers details using "roomId"
         {"  localhost:8080/reservation/room/1   "}        
   ############################################################################################
                
                 ***** RoomController*****      
 
    4.   createRoom(@RequestBody Room room)  :== { "id" : 7, 
                                                  "category": "doubleBed",
                                                  "is_available" : "yes",
                                                  "price" :500
                                               }
                 
}
*/

import org.springframework.web.bind.annotation.RequestBody;

import com.project.entity.Room;
