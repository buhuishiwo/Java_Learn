package com.haishili.spring6.test;


import com.haishili.spring6.config.Spring6Configuration;
import com.haishili.spring6.entity.Book;
import com.haishili.spring6.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest {

    @Test
    public void LibraryTest01() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        bookService.addBook(new Book(1,"《活着》","余华"));
        bookService.addBook(new Book(2,"《人间失格》","太宰治"));
        bookService.addBook(new Book(3,"《三体》","刘慈欣"));
        bookService.addBook(new Book(4,"《嫌疑人 X 的献身》","东野圭吾"));
        bookService.addBook(new Book(5,"《LOVE OVER FEAR》","NATIONAL GEOGRAPHIC"));
    }
}
