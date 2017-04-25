package com.crud.spring.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@Table(name="Lokal")
@SecondaryTable(name = "Ocena")
public class Lokal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idLokal")
	private int id;
	
	@Column(name="Nazwa")
	private String name;
	
	@Column(name="Numer_telefonu")
	private String phone_number;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="Ulica")
	private String street;
	
	@Column(name="Miasto")
	private String city;
	
	@Column(name="Ocena_idOcena")
	private Integer idRating;
	
	@Column(table="Ocena",name="idOcena")
	private Integer rating;
	
	public Lokal(){
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	public Integer getIdRating() {
		return idRating;
	}

	public void setIdRating(Integer idRating) {
		this.idRating = idRating;
	}
	
	@Override
	public String toString() {
		return "Local [id=" + id + ", name=" + name + ", phone_number=" + phone_number + ", email=" + email
				+ ", street=" + street + ", city=" + city + ", rating=" + rating + "]";
	}
	

}
