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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public House getHouse() {
		return house;
	}

	public void setHouse(House house) {
		this.house = house;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
