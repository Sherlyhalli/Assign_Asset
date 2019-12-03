package com.itaim.app.domain;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="assign_asset")
public class AssignAsset implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	
	@Column(name="AssetType")
	private String assetType;
	
	@Column(name="SerialNumber")
	private String serialNumber;
	
	@Column(name="AssignTo")
	private  String assignTo;
	
	@Column(name="AssignmentDate")
	private Date assignmentDate;
	
	public AssignAsset() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getAssignTo() {
		return assignTo;
	}

	public void setAssignTo(String assignTo) {
		this.assignTo = assignTo;
	}

	public Date getAssignmentDate() {
		return assignmentDate;
	}

	public void setAssignmentDate(Date assignmentDate) {
		this.assignmentDate = assignmentDate;
	}

	@Override
	public String toString() {
		return "AssignAsset [id=" + id + ", assetType=" + assetType + ", serialNumber=" + serialNumber + ", assignTo="
				+ assignTo + ", assignmentDate=" + assignmentDate + "]";
	}
	

}
