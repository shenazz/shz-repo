package com.shenaz.junk.officemanager.dao;

import java.util.Set;

import com.shenaz.junk.officemanager.model.Office;

public interface OfficeDAO {

	boolean createOffice(String city, String country, String openFrom, String openTill);

	Set<Office> getOffices();


	//

}
