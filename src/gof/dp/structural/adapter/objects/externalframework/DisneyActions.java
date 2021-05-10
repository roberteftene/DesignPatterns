package gof.dp.structural.adapter.objects.externalframework;

public interface DisneyActions {

    void changeLocation(int x, int y);
    void isWounded(int lostLifePoints);
    void isHealing(int recoverPoints);

    String getName();
    int getLifePoints();

}
