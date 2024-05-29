package com.project.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{

	Optional<Room> findById(Long id);
	
	
	@Query(value=" select *from room where is_available= 'yes' " ,nativeQuery=true)
	List <Room> isAvailableRoom();

}
