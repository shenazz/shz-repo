package com.shenaz.junk.officemanager.rest.officemanager.rest;

import java.util.Collections;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.shenaz.officemanager.model.IOffice;
import com.shenaz.officemanager.model.Office;

/**
 * Root resource (exposed at "officemanager" path)
 */
@Path("officemanager")
public class OfficeManager {

	/**
	 * @param office
	 * @return
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	@Path("createoffice")
	public String createOffice(IOffice office) {
		return Boolean.toString(false);
	}

	/**
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getoffices")
	public Set<Office> getOffices() {
		return Collections.emptySet();
	}
}
