package fun.configuration;

import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;

public enum MyFeatures implements Feature{

    @EnabledByDefault
    @Label("Can create user")
    CAN_CREATE_USER;

    public boolean isActive(){
        return FeatureContext.getFeatureManager().isActive(this);
    }
}
