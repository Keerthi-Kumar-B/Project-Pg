package com.example.practice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practice.dto.PgCandidate;
@Repository
public interface PgRepo extends JpaRepository<PgCandidate, Integer> {

}
