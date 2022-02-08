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
@Table(name = "houses")
@Data
public class House implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	
	@Column(name = "flats", nullable = false)
	private int flats;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "available", nullable = false)
	private boolean available;
	
	@OneToOne
	@JoinColumn(name = "address_id", nullable = false, unique = true)
	private Address address;
	
	
}
