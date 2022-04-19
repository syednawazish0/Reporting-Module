package com.alzohar.products.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product_service")
@Entity
public class Product {

	public Product(String string, int nextInt, int nextInt2) {
	}

	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private double price;

	@Column(name = "brand")
	private String brand;

	@Column(name = "description")
	private String desc;

	@Column(name = "enabled")
	private String enabled;

	@CreatedDate
	@Column(name = "createdAt")
	private LocalDateTime createdAt;

}
