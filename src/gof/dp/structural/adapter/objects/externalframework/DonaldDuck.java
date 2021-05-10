package gof.dp.structural.adapter.objects.externalframework;

public class DonaldDuck implements DisneyActions {

    String name;
    int lifePoints;

    public DonaldDuck(int lifePoints) {
        this.lifePoints = lifePoints;
        this.name = "Donald Duck";
    }

    @Override
    public void changeLocation(int x, int y) {
        System.out.println(this.name + " is moving to a new location");
    }

    @Override
    public void isWounded(int lostLifePoints) {
        System.out.println(String.format("%s lost %d points",this.name,lostLifePoints));
    }

    @Override
    public void isHealing(int recoverPoints) {
        System.out.println(String.format("%s recovered %d points",this.name,recoverPoints));
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getLifePoints() {
        return this.lifePoints;
    }
}
