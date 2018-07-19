package io.swagger.api.factories;

import io.swagger.api.NavApiService;
import io.swagger.api.impl.NavApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2018-07-13T12:11:03.902Z")
public class NavApiServiceFactory {
    private final static NavApiService service = new NavApiServiceImpl();

    public static NavApiService getNavApi() {
        return service;
    }
}
