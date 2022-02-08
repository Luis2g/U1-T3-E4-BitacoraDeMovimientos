package mx.edu.utez.entity;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Table(name = "loggedAddresses")
@Data
public class LoggedAddress implements Serializable{
	
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
	
	@Column(name = "address_id")
	private int addressId;
	
	@Column(name = "innerNumber")
	private int innerNumber;
	
	@Column(name = "outterNumber")
	private int outterNumber;
	
	@Column(name = "zipCode")
	private String zipCode;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "colonia")
	private String colonia;
	
	@Column(name = "municipio")
	private String municipio;

	@Column(name = "state")
	private String state;
	
	@OneToOne(mappedBy = "loggedAddress")
	@JsonIgnore
	private LoggedHouse loggedHouse;
	
	

}
