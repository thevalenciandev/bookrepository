package com.thevalenciandev.bookrepo;

public interface BookRepository {

    Book getByIsbn(String isbn);
}
