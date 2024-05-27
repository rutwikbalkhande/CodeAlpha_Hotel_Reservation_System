package com.project.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Reservation;
import com.project.repository.ReservationRepository;
import com.project.repository.RoomRepository;
import com.project.entity.Room;

@Service
public class ReservationService {


	
	@Autowired
    private ReservationRepository reservationRepository;
	
	@Autowired
	private RoomRepository roomRepository;

    public List<Reservation> getAllReservations() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    public Reservation getReservById(int id) {
        return reservationRepository.findById(id).orElse(null);
    }

    public Reservation saveReservation(Reservation reservation) {
        System.out.println(reservation);
    	return reservationRepository.save(reservation);
    }
    
    // find how many person booked room with all details using room no. get all people
    /*     public List<Reservation> getbookingDetailByRoomId(Long bookedId)
    {
//    	return reservationRepository.bookingDetilsByID(bookedId);
    	    	ArrayList<Reservation> specificReservations = new ArrayList<>();
    	List<Reservation> allReservations = reservationRepository.findAll();
    	for(Reservation reservation : allReservations) {
    		if(reservation.getRoom().getId()==roomId) {
    			specificReservations.add(reservation);
    		}
    	}
    	
    	
    	return specificReservations;
    */
    
    public List<Reservation> getBookingDetailsByRoomId(Long roomId) {
        return reservationRepository.bookingDetailsByRoomId(roomId);
    }
    	
    	}
   

