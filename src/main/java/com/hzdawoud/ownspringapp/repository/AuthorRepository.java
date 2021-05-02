package com.hzdawoud.ownspringapp.repository;

import com.hzdawoud.ownspringapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
