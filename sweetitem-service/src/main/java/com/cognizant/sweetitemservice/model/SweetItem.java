package com.cognizant.sweetitemservice.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="sweet_item")
public class SweetItem {

	@Id
	@Min(value = 1,message = "Item ID should not be 0 or less than 0")
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@NotNull(message="SweetItem name should not be NULL")
	private String name;
	
	private float price;
	private boolean active;
	
	@NotNull(message="SweetItem Launch Date should not be NULL")
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
	private Date dateOfLaunch;
	private boolean freeDelivery;
}
