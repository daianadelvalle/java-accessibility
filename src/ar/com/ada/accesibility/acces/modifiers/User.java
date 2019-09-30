package ar.com.ada.accesibility.acces.modifiers;

public class User {
    protected String nickName;
    protected String password;

    protected void ShowAtributteValues() {
        System.out.println("nickName = " + nickName);
        System.out.println("password = " + password);
    }
}
