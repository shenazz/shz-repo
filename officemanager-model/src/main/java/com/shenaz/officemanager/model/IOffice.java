package com.shenaz.officemanager.model;

import java.time.LocalDateTime;

/**
 * @author ShenazAssu
 *
 */
public interface IOffice {

	/**
	 * @return
	 */
	long getId();

	/**
	 * @param id
	 */
	void setId(long id);

	/**
	 * @return
	 */
	String getContactName();

	/**
	 * @param contactName
	 */
	void setContactName(String contactName);

	/**
	 * @return
	 */
	String getCity();

	/**
	 * @param city
	 */
	void setCity(String city);

	/**
	 * @return
	 */
	String getCountry();

	/**
	 * @param country
	 */
	void setCountry(String country);

	/**
	 * @return
	 */
	LocalDateTime getOpenFrom();

	/**
	 * @param openFrom
	 */
	void setOpenFrom(LocalDateTime openFrom);

	/**
	 * @return
	 */
	LocalDateTime getOpenTill();

	/**
	 * @param openTill
	 */
	void setOpenTill(LocalDateTime openTill);

}