package com.project.service;
import java.util.List;

import org.hibernate.persister.collection.mutation.UpdateRowsCoordinatorOneToMany;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Room;
import com.project.repository.RoomRepository;

@Service
public class RoomService {

	@Autowired
	private RoomRepository roomRepository ;
	
	public List<Room>  getAllRoom() {
		
		return (List<Room>) roomRepository.findAll();
	}
	 
	public Room getRoomById(int id) {
	        return roomRepository.findById(id).orElse(null);
	    }

	public Room saveRoom(Room room)
	{
		Room showdata = roomRepository.save(room);
		return showdata;
	}
      
	public List<Room> availableRoom() {	   
    	 return roomRepository.isAvailableRoom();	    	  
    }
	


	public Room updateRoom(Room room) {
		Room update=roomRepository.save(room);
		return update;
	}
}
