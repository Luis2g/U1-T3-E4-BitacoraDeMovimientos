package mx.edu.utez.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Table(name = "addresses")
@Data
public class Address implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	
	@Column(name = "innerNumber")
	private int innerNumber;
	
	@Column(name = "outterNumber")
	private int outterNumber;
	
	@Column(name = "zipCode", nullable = false)
	private String zipCode;
	
	@Column(name = "street", nullable = false)
	private String street;
	
	@Column(name = "colonia", nullable = false)
	private String colonia;
	
	@Column(name = "municipio", nullable = false)
	private String municipio;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	@OneToOne(mappedBy = "address")
	@JsonIgnore
	private House house;
	
	
	
}
