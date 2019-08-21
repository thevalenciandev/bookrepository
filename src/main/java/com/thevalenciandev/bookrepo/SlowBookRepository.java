package com.thevalenciandev.bookrepo;

import org.springframework.stereotype.Component;

@Component
public class SlowBookRepository implements BookRepository {

    @Override
    public Book getByIsbn(String isbn) {
        simulateSlowness();
        return new Book(isbn, "Some book");
    }

    private void simulateSlowness() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
