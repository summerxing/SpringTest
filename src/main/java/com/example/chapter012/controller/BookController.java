package com.example.chapter012.controller;

import com.example.chapter012.entity.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author HP
 * @date 2021/8/6
 */
@RestController
public class BookController {
    @GetMapping("/book")
    public Book book (){
        Book book = new Book();
        book.setName("sanguo");
        book.setAuthor("luogaunz");
        book.setPrice(30f);
        book.setPublicationDate(new Date());
        return book;
    }
}
