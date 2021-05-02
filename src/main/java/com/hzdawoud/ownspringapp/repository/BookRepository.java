package com.hzdawoud.ownspringapp.repository;

import com.hzdawoud.ownspringapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
