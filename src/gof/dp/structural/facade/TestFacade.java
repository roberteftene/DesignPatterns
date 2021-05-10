package gof.dp.structural.facade;

import gof.dp.structural.facade.GameFramework.GameFrameworkFacade;

public class TestFacade {

    public static void main(String[] args) {

        //toward connecting to the game from an external app you need to:

        //1. create player profile and login
//        PlayerProfile playerProfile = new PlayerProfile();
//        playerProfile.login();
//        playerProfile.getUserSettings();
//
        //2. check subscription
//        Subscription subscription = new Subscription();
//        subscription.checkSubscription();

        GameFrameworkFacade.createProfileAndConnect();


    }
}
