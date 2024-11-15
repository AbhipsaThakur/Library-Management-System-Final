package com.example.springsecurity.test.librarymanagementsystemfinal.repo;

import com.example.springsecurity.test.librarymanagementsystemfinal.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface AuthorRepo extends JpaRepository<Author, Integer> {
}
