package com.teleapps.zoomcustomer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ZoomCustomer")
public class ZoomCustomer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;

	private String customerName;

	private String phoneNumber;

	private String emailId;

	private String vipCustomer;

	private String carModel;

	private String tyre;

	private int tyreCount;

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getVipCustomer() {
		return vipCustomer;
	}

	public void setVipCustomer(String vipCustomer) {
		this.vipCustomer = vipCustomer;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getTyre() {
		return tyre;
	}

	public void setTyre(String tyre) {
		this.tyre = tyre;
	}

	public int getTyreCount() {
		return tyreCount;
	}

	public void setTyreCount(int tyreCount) {
		this.tyreCount = tyreCount;
	}

	public ZoomCustomer(Long customerId, String customerName, String phoneNumber, String emailId, String vipCustomer,
			String carModel, String tyre, int tyreCount) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.vipCustomer = vipCustomer;
		this.carModel = carModel;
		this.tyre = tyre;
		this.tyreCount = tyreCount;
	}

	public ZoomCustomer() {
		
	}

	@Override
	public String toString() {
		return "ZoomCustomer [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber="
				+ phoneNumber + ", emailId=" + emailId + ", vipCustomer=" + vipCustomer + ", carModel=" + carModel
				+ ", tyre=" + tyre + ", tyreCount=" + tyreCount + "]";
	}
	

}
