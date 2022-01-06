package com.study.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity    //DB에 있는 TABLE을 의미
@Data      //getter, setter
public class Board {

    @Id   //PK를 의미
    @GeneratedValue(strategy = GenerationType.IDENTITY) //JPA가 ENTITY를 읽고 DB TABLE로 매핑
    private Integer id;
    private String title;
    private String content;
}
