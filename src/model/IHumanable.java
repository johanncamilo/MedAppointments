package model;

public interface IHumanable {
    default void saludar() {
        System.out.println("Buenos días");
    }
}
