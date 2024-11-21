package com.org.api.books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class inMemoryBookRepository implements BookRepository {
    private final static List<Book> booksDB = new ArrayList<>();

    public inMemoryBookRepository() {

        booksDB.add(new Book("A123", "titulo prueba", "author prueba"));
        booksDB.add(new Book("A124", "titulo prueba1", "author prueba1"));

    }

    @Override
    public List<Book> findAll() {
        return Collections.unmodifiableList(booksDB);


    }

    @Override
    public Optional<Book> findByIsbn(String isbn) {
        for (Book book : booksDB) {
            if (book.getIsbn().equals(isbn)) return Optional.of(book);
        }
        return Optional.empty();
    }

    @Override
    public void save(Book book) {
        booksDB.add(book);

    }

    @Override
    public void deleteByIsbn(String isbn) {
        booksDB.removeIf(book -> book.getIsbn().equals(isbn));

    }


}
