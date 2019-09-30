package ar.com.ada.accesibility.acces.modifiers;

public class Bank {
    private Integer numberAccount;
    private String amount;

    private void ShowAttributeValues() {
        System.out.println("numberAccount = " + numberAccount);
        System.out.println("amount = " + amount);
    }
}
