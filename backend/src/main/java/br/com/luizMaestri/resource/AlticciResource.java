package br.com.luizMaestri.resource;

import br.com.luizMaestri.service.AlticciService;

import javax.inject.Inject;
import javax.validation.constraints.PositiveOrZero;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alticci")
public class AlticciResource {

    @Inject
    AlticciService service;

    public AlticciResource(AlticciService service) {
        this.service = service;
    }

    @GET
    @Path("{n}")
    @Produces(MediaType.TEXT_PLAIN)
    public Integer get(@PositiveOrZero int n) {
        return service.calculate(n);
    }
}