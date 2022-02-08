package mx.edu.utez.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name = "loggedAddress")
	private LoggedAddress loggedAddress;
	

}
