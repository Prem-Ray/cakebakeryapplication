package org.premanshuray.cakebakeryapplication;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {
    Frosting frosting ;
    Syrup syrup ;

    public CakeBaker(Frosting frosting, Syrup syrup) {
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void bakeCake(){
        frosting.getFrostingType();
        syrup.getSyrupType();
    }
}
