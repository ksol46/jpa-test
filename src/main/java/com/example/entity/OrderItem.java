package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="orderItem")
@Getter
@Setter
@ToString
public class OrderItem {

	@Id
	@Column(name="oeder_item_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable = false)
	private int orderPrice;
	
	@Column(nullable = false)
	private int count;
	
}
