package com.haishili.spring6.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {
    private String name;
    private List<Book> books = new ArrayList<>();

    public User() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名");
        this.name = scanner.next();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBook() {
        return books;
    }

    public void getBookDetail() {
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}
