package gof.dp.behavioral.strategy;

public class UsualNoCampaign implements IBonusStrategy {
    @Override
    public void getBonusPoints(int pointsReceived, Player player) {
        player.experiencePoints += pointsReceived;
    }
}
