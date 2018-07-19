package io.swagger.api;

import io.swagger.model.*;
import io.swagger.api.NavApiService;
import io.swagger.api.factories.NavApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Navigation;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/nav")


@io.swagger.annotations.Api(description = "the nav API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-13T12:11:03.902Z")
public class NavApi  {
   private final NavApiService delegate;

   public NavApi(@Context ServletConfig servletContext) {
      NavApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("NavApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (NavApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = NavApiServiceFactory.getNavApi();
      }

      this.delegate = delegate;
   }

    @GET
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Returns all the navigation links available", notes = "", response = InlineResponse200.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Success response", response = InlineResponse200.class) })
    public Response navGet(@ApiParam(value = "Type of nav link to return", allowableValues="top, bottom") @QueryParam("navtype") String navtype
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.navGet(navtype,securityContext);
    }
    @DELETE
    @Path("/{navid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Deletes a nav link", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "nav link not found", response = Void.class) })
    public Response navNavidDelete(@ApiParam(value = "nav link id to delete",required=true) @PathParam("navid") Long navid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.navNavidDelete(navid,securityContext);
    }
    @GET
    @Path("/{navid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Find nav link by ID", notes = "", response = Navigation.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "successful operation", response = Navigation.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Nav link not found", response = Void.class) })
    public Response navNavidGet(@ApiParam(value = "ID of nav link to return",required=true) @PathParam("navid") Long navid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.navNavidGet(navid,securityContext);
    }
    @PUT
    @Path("/{navid}")
    
    
    @io.swagger.annotations.ApiOperation(value = "Update an existing nav link", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 400, message = "Invalid ID supplied", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Nav link not found", response = Void.class) })
    public Response navNavidPut(@ApiParam(value = "ID of nav link to return",required=true) @PathParam("navid") Long navid
,@ApiParam(value = "Nav object that needs to be added to the store" ,required=true) Navigation body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.navNavidPut(navid,body,securityContext);
    }
    @POST
    
    
    
    @io.swagger.annotations.ApiOperation(value = "Add a new nav link to the store", notes = "", response = Void.class, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    public Response navPost(@ApiParam(value = "Nav object that needs to be added to the store" ,required=true) Navigation body
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.navPost(body,securityContext);
    }
}
