package tsui.skye.sample.server.user.resource;

import io.dropwizard.jersey.PATCH;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by @author Skye Tsui {@literal <skyetsui@gmail.com>}
 */
@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    public String createUser(User user) {
        throw new WebApplicationException(Response.Status.NOT_IMPLEMENTED);
    }

    @GET
    @Path("/{userId}")
    public User readUser(@PathParam("userId") String userId) {
        throw new WebApplicationException(Response.Status.NOT_IMPLEMENTED);
    }

    @HEAD
    @Path("/{userId}")
    public void isUserExist(@PathParam("userId") String userId) {
        throw new WebApplicationException(Response.Status.NOT_IMPLEMENTED);
    }

    @PATCH
    @Path("/{userId}")
    public String updateUser(@PathParam("userId") String userId, User user) {
        throw new WebApplicationException(Response.Status.NOT_IMPLEMENTED);
    }

    @DELETE
    @Path("/{userId}")
    public boolean deleteUser(@PathParam("userId") String userId) {
        throw new WebApplicationException(Response.Status.NOT_IMPLEMENTED);
    }
}
