package com.example.reactbootlogin.service;

import com.example.reactbootlogin.entity.Board;
import com.example.reactbootlogin.repository.BoardRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional // 트랜잭션 관리를 스프링에 위임
@RequiredArgsConstructor // 의존성 주입을 위해 필요한 생성자를 자동 생성 @Autowired 어노테이션 사용하지않고 의존성 주입 처리
public class BoardService {

    private final BoardRepository boardRepository;

    public List<Board> getAllBoards() {
        return boardRepository.findAll()
    }
}
