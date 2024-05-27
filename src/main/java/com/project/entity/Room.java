package com.project.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Room {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String category;
	    private String isAvailable;
	    private double price;
	    
	    @OneToMany(mappedBy = "room")
		private List<Reservation> resrvation;

	    // Constructors, getters, and setters

	    public Room() {
	    }

	    public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String isAvailable() {
			return isAvailable;
		}

		public void setAvailable(String isAvailable) {
			this.isAvailable = isAvailable;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public Room(Long id, String category, String isAvailable, double price) {
			super();
			this.id = id;
			this.category = category;
			this.isAvailable = isAvailable;
			this.price = price;
		}

		
		
}
