package com.study.board.service;

import com.study.board.entity.Board;
import com.study.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired    //DI, 의존성주입
    private BoardRepository boardRepository;

    public void insertBbs(Board board){
        boardRepository.save(board);
    }
}
