package ru.netology.java.mvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    @Test
    public void testWhenProductFind() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);
        Book book1 = new Book(1, "Норвежский лес", 357, "Харуки Мураками");
        Book book2 = new Book(2, "Идиот", 290, "Ф.М. Достаевский");
        Book book3 = new Book(3, "Дюна", 689, "Френк Герберт");
        Smartphone smartphone1 = new Smartphone(4, "Iphone11", 50000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone13", 60000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Samsung8", 30000, "Samsung");
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        Product[] actual = manager.searchBy("Идиот");
        Product[] expected = {book2};

        Assertions.assertArrayEquals (expected, actual);
    }
    @Test
    public void testWhenProductNotFind() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);
        Book book1 = new Book(1, "Норвежский лес", 357, "Харуки Мураками");
        Book book2 = new Book(2, "Идиот", 290, "Ф.М. Достаевский");
        Book book3 = new Book(3, "Дюна", 689, "Френк Герберт");
        Smartphone smartphone1 = new Smartphone(4, "Iphone11", 50000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone13", 60000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Samsung8", 30000, "Samsung");
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        Product[] actual = manager.searchBy("Бесы");
        Product[] expected = {};

        Assertions.assertArrayEquals (expected, actual);
    }
    @Test
    public void testWhenFewProductFind() {
        Repository repository = new Repository();
        Manager manager = new Manager(repository);
        Book book1 = new Book(1, "Норвежский лес", 357, "Харуки Мураками");
        Book book2 = new Book(2, "Идиот", 290, "Ф.М. Достаевский");
        Book book3 = new Book(3, "Дюна", 689, "Френк Герберт");
        Smartphone smartphone1 = new Smartphone(4, "Iphone11", 50000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone13", 60000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Samsung8", 30000, "Samsung");
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        Product[] actual = manager.searchBy("Iphone");
        Product[] expected = {smartphone1, smartphone2};

        Assertions.assertArrayEquals (expected, actual);
    }
}