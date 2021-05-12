package gof.dp.structural.proxy.protectionandremote;

//Proxy
public class LoginW2FactorAuth implements LoginInterface {

    LoginInterface loginModule = null;

    public LoginW2FactorAuth(LoginInterface loginModule) {
        this.loginModule = loginModule;
    }

    public boolean checkGeneratedCode(int code) {
        return code == 1245;
    }


    @Override
    public boolean login(String username, String password) {
        if(this.loginModule.login(username,password)) {
            System.out.println("Sending extra code...");
            System.out.println("Please input the code received via SMS: ");
            if(checkGeneratedCode(1245)) {
                System.out.println("Hello " + username);
                return true;
            } else {
                System.out.println("Incorrect code");
            }
        }
        return false;
    }

    @Override
    public boolean checkServerStatus() {
        return loginModule.checkServerStatus();
    }
}
