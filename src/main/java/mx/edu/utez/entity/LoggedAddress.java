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

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getInnerNumber() {
		return innerNumber;
	}

	public void setInnerNumber(int innerNumber) {
		this.innerNumber = innerNumber;
	}

	public int getOutterNumber() {
		return outterNumber;
	}

	public void setOutterNumber(int outterNumber) {
		this.outterNumber = outterNumber;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public LoggedHouse getLoggedHouse() {
		return loggedHouse;
	}

	public void setLoggedHouse(LoggedHouse loggedHouse) {
		this.loggedHouse = loggedHouse;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
