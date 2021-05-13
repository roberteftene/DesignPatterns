package gof.dp.behavioral.strategy;

public class Player {
    String username;
    int playTime;
    int experiencePoints;

    IBonusStrategy bonusStrategy = new UsualNoCampaign();

    public void setBonusStrategy(IBonusStrategy bonusStrategy) {
        this.bonusStrategy = bonusStrategy;
    }

    public Player(String username, int playTime, int experiencePoints) {
        this.username = username;
        this.playTime = playTime;
        this.experiencePoints = experiencePoints;
    }

    public void addExperiencePoints(int pointsReceived) {
        if(this.bonusStrategy != null) {
            this.bonusStrategy.getBonusPoints(pointsReceived,this);
        }
    }
}
