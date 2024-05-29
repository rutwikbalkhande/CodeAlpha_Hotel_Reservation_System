package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Reservation;
import com.project.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
	//{check com.project -> Notes_Important for details method}
	//URL ==  localhost:8080/reservation/
	
	@Autowired
	private ReservationService reservationService;
	
	              //display reservation table data 
	 @GetMapping("/")
	    public List<Reservation> getAllReservations() {
	        return reservationService.getAllReservations();
	    }
	 
	             // find customer booking details using ReservatinID from Table resrvation	
	 @GetMapping("/{id}")
	    public Reservation getReservById(@PathVariable int id) {
	        return reservationService.getReservById(id);
	    }

	           // booking room	 
	    @PostMapping("/")
	    public Reservation createReservation(@RequestBody Reservation reservation) {
	        return reservationService.saveReservation(reservation);
	    }
	    
	    
	         // find booking history of room  { localhost:8080/reservation/room/1  } 
	    
	     @GetMapping("/room/{roomId}")
	    public List<Reservation> getBookingDetailsByRoomId(@PathVariable Long roomId) {
	        return reservationService.getBookingDetailsByRoomId(roomId);
	    }

}
