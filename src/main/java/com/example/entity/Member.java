package com.example.entity;

import java.util.Date;

import javax.persistence.*;

import com.example.constant.MemberClass;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
	/*DTO 클래스
	 * ()안에 네임을 지정해주면 그 이름으로 들어가고
	 * 작성하지 않으면 변수명으로 들어간다.
	 * 열거형 클래스가 들어가면 @Enumerated 어노테이션을 꼭 붙인다.
	*/
	
	@Id //primary key 이다. pk가 오는 속성에 어노테이션을 붙여줌.
	@Column(name="member_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Enumerated(EnumType.STRING)
	@Column
	private MemberClass memberclass;
	
	//날짜 타입을 mapping 할 때 사용한다.
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
}
