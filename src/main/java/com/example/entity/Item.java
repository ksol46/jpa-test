package com.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.*;

import lombok.*;

@Entity
@Table(name="item")
@Getter
@Setter
@ToString
public class Item {

	@Id
	@Column(name="item")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false, length = 50)
	private String name;
	
	@Column(nullable = false)
	private int price;
	
	@Column(nullable = false)
	private int stockQuanity;
	
}
