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
	
	@Autowired
	private ReservationService reservationService;
	
	 @GetMapping("/")
	    public List<Reservation> getAllReservations() {
	        return reservationService.getAllReservations();
	    }
	 @GetMapping("/{id}")
	    public Reservation getReservById(@PathVariable int id) {
	        return reservationService.getReservById(id);
	    }

	    @PostMapping("/")
	    public Reservation createReservation(@RequestBody Reservation reservation) {
	        return reservationService.saveReservation(reservation);
	    }
	    
	    @GetMapping("/room/{roomId}")
	    public List<Reservation> getBookingDetailsByRoomId(@PathVariable Long roomId) {
	        return reservationService.getBookingDetailsByRoomId(roomId);
	    }

}
