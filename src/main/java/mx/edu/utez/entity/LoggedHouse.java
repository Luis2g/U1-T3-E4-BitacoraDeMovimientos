package mx.edu.utez.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "loggedHouses")
@Data
public class LoggedHouse implements Serializable{
	
	private final static long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "DateOfAction")
	private String dateOfAction;
	
	@Column(name = "action")
	private String action;
	
	@Column(name = "house_id")	
	private int houseId;
	
	@Column(name = "flats")
	private int flats;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "available")
	private boolean available;
	
	@Column(name = "logged_address")
	private int loggedAddress;
	
//	@OneToOne
//	@JoinColumns({
//		@JoinColumn(name = "id"),
//		@JoinColumn(name = "loggedAddress")		
//	})
//	private LoggedAddress loggedAddress;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getDateOfAction() {
		return dateOfAction;
	}

	public void setDateOfAction(String dateOfAction) {
		this.dateOfAction = dateOfAction;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public int getHouseId() {
		return houseId;
	}

	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}

	public int getFlats() {
		return flats;
	}

	public void setFlats(int flats) {
		this.flats = flats;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public int getLoggedAddress() {
		return loggedAddress;
	}

	public void setLoggedAddress(int loggedAddress) {
		this.loggedAddress = loggedAddress;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
