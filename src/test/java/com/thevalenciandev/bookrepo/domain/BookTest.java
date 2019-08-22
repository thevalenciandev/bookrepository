package com.thevalenciandev.bookrepo.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@DisplayName("Some POJO tests")
class BookTest {

    @Test
    void canCreateABook() {
        Book aBook = new Book("1234", "A title");
        assertThat(aBook.getIsbn(), is("1234"));
        assertThat(aBook.getTitle(), is("A title"));
    }
}