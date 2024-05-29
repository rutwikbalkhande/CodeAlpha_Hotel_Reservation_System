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
	    private String is_available;
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

		public String getis_available() {
			return is_available;
		}

		public void setis_available(String is_available) {
			this.is_available = is_available;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public Room(Long id, String category, String is_available, double price) {
			super();
			this.id = id;
			this.category = category;
			this.is_available = is_available;
			this.price = price;
		}

		
		
}
