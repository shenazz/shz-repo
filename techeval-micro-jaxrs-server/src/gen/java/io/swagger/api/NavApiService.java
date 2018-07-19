package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.InlineResponse200;
import io.swagger.model.Navigation;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-13T12:11:03.902Z")
public abstract class NavApiService {
    public abstract Response navGet( String navtype,SecurityContext securityContext) throws NotFoundException;
    public abstract Response navNavidDelete(Long navid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response navNavidGet(Long navid,SecurityContext securityContext) throws NotFoundException;
    public abstract Response navNavidPut(Long navid,Navigation body,SecurityContext securityContext) throws NotFoundException;
    public abstract Response navPost(Navigation body,SecurityContext securityContext) throws NotFoundException;
}
