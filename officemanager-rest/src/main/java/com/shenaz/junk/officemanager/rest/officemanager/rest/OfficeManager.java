package com.shenaz.junk.officemanager.rest.officemanager.rest;

import java.util.Set;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shenaz.junk.officemanager.dao.OfficeDAO;
import com.shenaz.junk.officemanager.dao.impl.DAOFactory;
import com.shenaz.junk.officemanager.model.Office;

/**
 * Root resource (exposed at "officemanager" path)
 */
@Path("officemanager")
public class OfficeManager {

	private OfficeDAO officeDAO;

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("createoffice")
	public String createOffice(Office office) {

		officeDAO = DAOFactory.getDao();
		boolean status = officeDAO.createOffice("", "", "", "");

		return Boolean.toString(status);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getoffices")
	public Set<Office> getOffices() {

		officeDAO = DAOFactory.getDao();
		Set<Office> offices = officeDAO.getOffices();

		return offices;
	}
}
