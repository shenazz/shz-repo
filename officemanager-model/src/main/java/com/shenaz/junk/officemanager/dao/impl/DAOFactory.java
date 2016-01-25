package com.shenaz.junk.officemanager.dao.impl;

import com.shenaz.junk.officemanager.dao.OfficeDAO;

public class DAOFactory {

	public static OfficeDAO getDao() {

		return OfficeDAOImpl.getOfficeDao();
	}

}
