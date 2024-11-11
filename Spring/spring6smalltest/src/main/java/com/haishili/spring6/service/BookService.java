package com.haishili.spring6.service;

import com.haishili.spring6.entity.Book;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
@Scope("singleton")
public class BookService {
    private List<Book> books = new ArrayList<>();


    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            System.out.println("书本添加成功!");
        } else {
            System.out.println("书库中已有相同数据，添加失败！");
        }
    }

    public void deleteBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }


    public Book getBook(int isbn) {
        return books.get(isbn);
    }

    public Book getBook(String bookName) {
        for (Book book : books) {
            if (book.getName().equals(bookName)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> getBooks() {
        return books;
    }
}
