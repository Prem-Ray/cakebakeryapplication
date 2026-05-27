package org.premanshuray.cakebakeryapplication.Impl.ChocolateFlavour;

import org.premanshuray.cakebakeryapplication.Syrup;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="syrupType", havingValue="chocolate")
public class ChocolateSyrup implements Syrup {
    @Override
    public void getSyrupType(){
        System.out.println("Chocolate Syrup");
    }
}
