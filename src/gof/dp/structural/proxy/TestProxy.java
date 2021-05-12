package gof.dp.structural.proxy;

import gof.dp.structural.proxy.protectionandremote.LoginInterface;
import gof.dp.structural.proxy.protectionandremote.LoginModule;
import gof.dp.structural.proxy.protectionandremote.LoginW2FactorAuth;

public class TestProxy {
    public static void main(String[] args) {
        LoginInterface loginModule = new LoginModule("10.0.0.1","users");

        if(loginModule.checkServerStatus()) {
            if(loginModule.login("admin","1234admin")) {
                System.out.println("Hello admin!");
            } else {
                System.out.println("Bad credentials");
            }
        } else {
            System.out.println("500 Internal Server Error");
        }

        loginModule = new LoginW2FactorAuth(loginModule);

        if(loginModule.checkServerStatus()) {
            if(loginModule.login("admin","1234admin")) {
                System.out.println("Hello admin!");
            } else {
                System.out.println("Bad credentials");
            }
        } else {
            System.out.println("500 Internal Server Error");
        }

    }
}
