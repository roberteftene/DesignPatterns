package gof.dp.structural.facade.GameFramework;

public class GameFrameworkFacade {

    public static void createProfileAndConnect() {
        PlayerProfile playerProfile = new PlayerProfile();
        playerProfile.login();
        playerProfile.getUserSettings();

        Subscription subscription = new Subscription();
        subscription.checkSubscription();
    }

}
