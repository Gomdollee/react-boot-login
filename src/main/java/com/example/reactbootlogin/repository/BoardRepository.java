package com.example.reactbootlogin.repository;

import com.example.reactbootlogin.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
