package com.ohgiraffers.section01.common;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("bookTest")
public class Bootest implements BookDAO{

    @Override
    public List<BookDTO> selectBookList() {
        return null;
    }

    @Override
    public BookDTO selectOneBook(int sequence) {
        return null;
    }
}
