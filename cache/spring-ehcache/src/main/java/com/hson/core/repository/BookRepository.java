package com.hson.core.repository;

import com.hson.core.model.Book;

public interface BookRepository {

    Book getByIsbn(String isbn);


    Book getByIsbnCache(String isbn);

}