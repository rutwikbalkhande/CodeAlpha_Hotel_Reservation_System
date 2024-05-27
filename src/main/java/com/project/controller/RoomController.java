package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Room;
import com.project.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	@Autowired
	private RoomService roomService;
	
	@GetMapping("/")
	public List<Room> getAllRoom()
	{
		List<Room> list=roomService.getAllRoom();
		
		return list;
	}
	
	@GetMapping("/{Id}")
	public Room getRoomById(@PathVariable int Id) {
		
		return roomService.getRoomById(Id);
	}
	
	@PostMapping("/")
	public Room createRoom(@RequestBody Room room)
	{
		return roomService.saveRoom(room);
	}
}
