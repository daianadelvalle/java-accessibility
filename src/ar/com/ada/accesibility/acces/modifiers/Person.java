package ar.com.ada.accesibility.acces.modifiers;

public class Person {
    public String name = "Daiana";
    public String lastName = "Delvalle";
    public Integer age = 25;

    public void ShowAttributeValues() {
        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);
        System.out.println("age = " + age);
    }
}
