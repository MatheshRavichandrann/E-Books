package com.mugiwarapirates.jpa.repo;

import com.mugiwarapirates.jpa.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AuthorRepository extends JpaRepository<Author, Integer> {
}
