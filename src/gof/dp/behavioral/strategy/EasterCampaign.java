package gof.dp.behavioral.strategy;

public class EasterCampaign implements IBonusStrategy {

    @Override
    public void getBonusPoints(int pointsReceived, Player player) {
        if(player.playTime > 5) {
            player.experiencePoints += (2*pointsReceived);
        }
    }
}
