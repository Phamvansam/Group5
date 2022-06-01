package com.vti.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`Position`")
public class Position implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Column(name = "position_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "position_name", nullable = false)
	@Enumerated(EnumType.STRING)
	private PositionName positionName;
	
	
	public enum PositionName {
		DEV,TEST,SRCUMMASTER,PM
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public PositionName getPositionName() {
		return positionName;
	}


	public void setPositionName(PositionName positionName) {
		this.positionName = positionName;
	}

	
	
	
}
