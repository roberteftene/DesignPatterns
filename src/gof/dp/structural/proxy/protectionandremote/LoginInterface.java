package gof.dp.structural.proxy.protectionandremote;

//Subject
public interface LoginInterface {
    boolean login(String username, String password);
    boolean checkServerStatus();
}
