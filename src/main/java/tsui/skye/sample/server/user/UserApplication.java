package tsui.skye.sample.server.user;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import tsui.skye.sample.server.user.health.MongoDBConnectionHealthCheck;
import tsui.skye.sample.server.user.resource.UserResource;

/**
 * Created by @author Skye Tsui {@literal <skyetsui@gmail.com>}
 */
public class UserApplication extends Application<UserAppConfiguration> {

    public static void main(String[] args) throws Exception {
        new UserApplication().run(args);
    }

    @Override
    public void run(UserAppConfiguration configuration, Environment environment) throws Exception {
        environment.healthChecks().register(MongoDBConnectionHealthCheck.NAME, new MongoDBConnectionHealthCheck());
        environment.jersey().register(new UserResource());
    }
}
