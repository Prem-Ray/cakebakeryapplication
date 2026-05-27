package org.premanshuray.cakebakeryapplication.Impl.StrawberryFlavour;

import org.premanshuray.cakebakeryapplication.Syrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="syrupType", havingValue="strawberry")
public class StrawberrySyrup implements Syrup {
    @Override
    public void getSyrupType(){
        System.out.println("Strawberry Syrup");
    }
}
