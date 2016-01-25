package com.shenaz.junk.officemanager.model.impl;

import javax.xml.bind.annotation.XmlRootElement;

import com.shenaz.junk.officemanager.model.Office;

@XmlRootElement
public class OfficeImpl implements Office {

	private String city;
	private String country;
	private String openFrom;
	private String openTill;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.impl.Office#getCity()
	 */
	public String getCity() {
		return city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.impl.Office#setCity(java.lang.String)
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.impl.Office#getCountry()
	 */
	public String getCountry() {
		return country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.impl.Office#setCountry(java.lang.String)
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.impl.Office#getOpenFrom()
	 */
	public String getOpenFrom() {
		return openFrom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.impl.Office#setOpenFrom(java.lang.String)
	 */
	public void setOpenFrom(String openFrom) {
		this.openFrom = openFrom;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.impl.Office#getOpenTill()
	 */
	public String getOpenTill() {
		return openTill;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.model.impl.Office#setOpenTill(java.lang.String)
	 */
	public void setOpenTill(String openTill) {
		this.openTill = openTill;
	}

	@Override
	public String toString() {
		return city + " - " + country + " - " + openFrom + " - " + openTill;
	}

}
