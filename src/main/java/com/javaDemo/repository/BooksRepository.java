package com.javaDemo.repository;
import org.springframework.data.repository.CrudRepository;

import com.javaDemo.model.Books;
public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
