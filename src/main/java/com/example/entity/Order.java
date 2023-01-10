package com.example.entity;

import javax.persistence.Entity;

import com.example.constant.OrderStatus;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name="order")
@Getter
@Setter
@ToString
public class Order {
	
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private LocalDateTime orderTime;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderstatus;
}
