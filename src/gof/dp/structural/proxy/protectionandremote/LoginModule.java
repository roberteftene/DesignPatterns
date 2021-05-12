package gof.dp.structural.proxy.protectionandremote;

//RealSubject
public class LoginModule implements LoginInterface {

    String serverIP;
    String dbConnection;

    public LoginModule(String serverIP, String dbConnection) {
        this.serverIP = serverIP;
        this.dbConnection = dbConnection;
    }



    @Override
    public boolean login(String username, String password) {
        System.out.println("Connecting to the database: " + dbConnection);
        return username.toLowerCase().equals("admin") && password.equals("1234admin");
    }

    @Override
    public boolean checkServerStatus() {
        return true;
    }
}
