package tsui.skye.sample.server.user.health;

import com.codahale.metrics.health.HealthCheck;

/**
 * Created by @author Skye Tsui {@literal <skyetsui@gmail.com>}
 */
public class MongoDBConnectionHealthCheck extends HealthCheck {

    public static final String NAME = "MongoDBConnection";

    @Override
    protected Result check() throws Exception {
        return Result.unhealthy("Not implemented");
    }
}
