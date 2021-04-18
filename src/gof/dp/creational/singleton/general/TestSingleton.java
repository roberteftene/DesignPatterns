package gof.dp.creational.singleton.general;

public class TestSingleton {

    public static void main(String[] args) {

        DBConnection dbConnection = DBConnection.getInstance("localhost@8080","V1");
        DBConnection dbConnection1 = DBConnection.getInstance("localhost@8080","V1");

        if(dbConnection.equals(dbConnection1)) {
            System.out.printf("Same");
        } else {
            System.out.printf("Not same");
        }

    }


}
