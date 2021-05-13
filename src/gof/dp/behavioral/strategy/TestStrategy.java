package gof.dp.behavioral.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        Player player = new Player("john",10,100);

        player.addExperiencePoints(100);
        System.out.println("Points: " + player.experiencePoints);

        player.setBonusStrategy(new EasterCampaign());
        player.addExperiencePoints(150);
        System.out.println("Points: " + player.experiencePoints);

        player.setBonusStrategy(new SummerCampaign());
        player.addExperiencePoints(300);
        System.out.println("Points: " + player.experiencePoints);

    }
}
