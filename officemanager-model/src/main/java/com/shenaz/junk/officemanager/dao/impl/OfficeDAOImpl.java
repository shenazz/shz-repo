/*
 * Copyright (c) NetApp Inc. - All Rights Reserved
 * 
 * Unauthorized copying of this file, via any medium is strictly prohibited.
 * Proprietary and confidential.
 * 
 * com.shenaz.junk.officemanager.dao.OfficeDAO 
 */
package com.shenaz.junk.officemanager.dao.impl;

import java.util.HashSet;
import java.util.Set;

import com.shenaz.junk.officemanager.dao.OfficeDAO;
import com.shenaz.junk.officemanager.model.Office;
import com.shenaz.junk.officemanager.model.impl.OfficeImpl;

/**
 * @author shenaz
 *
 */
public class OfficeDAOImpl implements OfficeDAO {

	private static OfficeDAO officeDAO;

	private Set<Office> offices;

	private OfficeDAOImpl() {
		offices = new HashSet<Office>();
	}

	protected static OfficeDAO getOfficeDao() {

		if (officeDAO == null) {
			officeDAO = new OfficeDAOImpl();
		}

		return officeDAO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.shenaz.junk.officemanager.dao.impl.OfficeDAO#createOffice(com.shenaz.junk.officemanager.model.Office)
	 */
	public boolean createOffice(String city, String country, String openFrom, String openTill) {
		Office office = new OfficeImpl();
		office.setCity(city);
		office.setCountry(country);
		office.setOpenFrom(openFrom);
		office.setOpenTill(openTill);

		return offices.add(office);
	}

	public Set<Office> getOffices() {
		return new HashSet<Office>(offices);
	}

}
