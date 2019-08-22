package com.thevalenciandev.bookrepo.repository;

import com.thevalenciandev.bookrepo.domain.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);
}
