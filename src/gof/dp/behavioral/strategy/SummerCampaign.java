package gof.dp.behavioral.strategy;

public class SummerCampaign implements IBonusStrategy {
    @Override
    public void getBonusPoints(int pointsReceived, Player player) {
        player.experiencePoints += (1.5 * pointsReceived);
    }
}
