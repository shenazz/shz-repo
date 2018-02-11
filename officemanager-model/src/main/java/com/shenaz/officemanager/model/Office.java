package com.shenaz.officemanager.model;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Office implements IOffice {

	private long id;
	private String contactName;
	private String city;
	private String country;
	private LocalDateTime openFrom;
	private LocalDateTime openTill;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#getId()
	 */
	public long getId() {
		return id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#setId(long)
	 */
	public void setId(long id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#getContactName()
	 */
	public String getContactName() {
		return contactName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.shenaz.junk.officemanager.model.IOffice#setContactName(java.lang.String)
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#getCity()
	 */
	public String getCity() {
		return city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#setCity(java.lang.String)
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#getCountry()
	 */
	public String getCountry() {
		return country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#setCountry(java.lang.String)
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#getOpenFrom()
	 */
	public LocalDateTime getOpenFrom() {
		return openFrom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#setOpenFrom(java.time.
	 * LocalDateTime)
	 */
	public void setOpenFrom(LocalDateTime openFrom) {
		this.openFrom = openFrom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#getOpenTill()
	 */
	public LocalDateTime getOpenTill() {
		return openTill;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.IOffice#setOpenTill(java.time.
	 * LocalDateTime)
	 */
	public void setOpenTill(LocalDateTime openTill) {
		this.openTill = openTill;
	}

}
