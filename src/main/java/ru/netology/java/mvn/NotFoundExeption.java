package ru.netology.java.mvn;

public class NotFoundExeption extends RuntimeException {
    public NotFoundExeption(int id) {
        super("Element with id: " + id + " not found");
    }
}
