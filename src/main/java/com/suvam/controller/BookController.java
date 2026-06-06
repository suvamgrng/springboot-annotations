package com.suvam.controller;

import com.suvam.book.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("api-book")
public class BookController {

    @GetMapping("hello-world")
    @ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("book")
    @ResponseBody
    public List<Book> getBook() {
        Book book1 = new Book(1, "Core Java", "Learn Java and Latest features");
        Book book2 = new Book(1, "Core Java", "Learn Java and Latest features");
        return List.of(book1, book2);
    }
}
