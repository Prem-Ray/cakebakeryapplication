package org.premanshuray.cakebakeryapplication.Impl.StrawberryFlavour;

import org.premanshuray.cakebakeryapplication.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="frostingType" , havingValue = "strawberry")
public class StrawberryFrosting implements Frosting {
    @Override
    public void getFrostingType(){
        System.out.println("Strawberry Frosting");
    }
}
