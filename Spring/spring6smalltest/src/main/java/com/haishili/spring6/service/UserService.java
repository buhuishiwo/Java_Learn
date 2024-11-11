package com.haishili.spring6.service;

import com.haishili.spring6.entity.Book;
import com.haishili.spring6.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Scanner;

@Service
@Scope("prototype")
public class UserService {
    private final User user = new User();
    private BookService bookService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }


    public void userBorrowBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要借阅书籍的名字");
        String bookName = scanner.nextLine();
        userBorrow(bookName);
    }

    public void userBorrow(String bookName) {
        if (bookService.getBook(bookName) != null) {
            user.setBooks(bookService.getBook(bookName));
            bookService.deleteBook(bookService.getBook(bookName));
            System.out.println("借阅成功");
        } else {
            System.out.println("查无此书，借阅失败");
        }
    }

    public void userGetBook() {
        user.getBookDetail();
    }

    public void userReturn() {
        List<Book> books = user.getBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入要还书籍名字");
        String bookNme = scanner.nextLine();
        for (Book book : books) {
            if (book.getName().equals(bookNme)) {
                user.deleteBook(book);
                bookService.addBook(book);
                System.out.println("归还成功");
                return;
            }
        }
    }
}
