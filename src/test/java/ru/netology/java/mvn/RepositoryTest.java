package ru.netology.java.mvn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    @Test
    public void testRemoveWhenProductTake() {
        Repository repository = new Repository();
        Book book1 = new Book(1, "Норвежский лес", 357, "Харуки Мураками");
        Book book2 = new Book(2, "Идиот", 290, "Ф.М. Достаевский");
        Book book3 = new Book(3, "Дюна", 689, "Френк Герберт");
        Smartphone smartphone1 = new Smartphone(4, "Iphone11", 50000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone13", 60000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Samsung8", 30000, "Samsung");
        repository.add(book1);
        repository.add(book2);
        repository.add(book3);
        repository.add(smartphone1);
        repository.add(smartphone2);
        repository.add(smartphone3);
        repository.removeById(4);

        Product[] actual = repository.findAll();
        Product[] expected = {book1, book2, book3, smartphone2, smartphone3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveWhenProductNotExist() {
        Repository repository = new Repository();
        Book book1 = new Book(1, "Норвежский лес", 357, "Харуки Мураками");
        Book book2 = new Book(2, "Идиот", 290, "Ф.М. Достаевский");
        Book book3 = new Book(3, "Дюна", 689, "Френк Герберт");
        Smartphone smartphone1 = new Smartphone(4, "Iphone11", 50000, "Apple");
        Smartphone smartphone2 = new Smartphone(5, "Iphone13", 60000, "Apple");
        Smartphone smartphone3 = new Smartphone(6, "Samsung8", 30000, "Samsung");
        repository.add(book1);
        repository.add(book2);
        repository.add(book3);
        repository.add(smartphone1);
        repository.add(smartphone2);
        repository.add(smartphone3);

        Assertions.assertThrows(NotFoundExeption.class, () -> {
            repository.removeById(10);
        });
    }
}