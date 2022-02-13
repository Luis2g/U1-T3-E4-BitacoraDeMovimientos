package mx.edu.utez.entity;

import javax.persistence.Table;

import lombok.Data;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	@Column(name = "address_id")
	private long addressId;

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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
