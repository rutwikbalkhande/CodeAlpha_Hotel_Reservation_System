package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.entity.Reservation;
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Integer>{

//	@Query(value = "SELECT * FROM reservation WHERE room_id = :roomId", nativeQuery = true)
	
	@Query(value = "SELECT * FROM reservation WHERE room_id = ?1" , nativeQuery = true)
    List<Reservation> bookingDetailsByRoomId(@PathVariable Long roomId);
}

