package com.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.project.entity.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer>{

	Optional<Room> findById(Long id);

}
