package org.premanshuray.cakebakeryapplication.Impl.ChocolateFlavour;

import org.premanshuray.cakebakeryapplication.Frosting;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="frostingType" , havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{
    @Override
    public void getFrostingType(){
        System.out.println("Chocolate Frosting");
    }
}
