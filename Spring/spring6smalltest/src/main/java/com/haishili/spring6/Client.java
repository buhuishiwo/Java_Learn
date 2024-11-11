package com.haishili.spring6;

import com.haishili.spring6.config.Spring6Configuration;
import com.haishili.spring6.entity.Book;
import com.haishili.spring6.service.BookService;
import com.haishili.spring6.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring6Configuration.class);
        BookService bookService = applicationContext.getBean("bookService", BookService.class);
        bookService.addBook(new Book(1, "《活着》", "余华"));
        bookService.addBook(new Book(2, "《人间失格》", "太宰治"));
        bookService.addBook(new Book(3, "《三体》", "刘慈欣"));
        bookService.addBook(new Book(4, "《嫌疑人 X 的献身》", "东野圭吾"));
        bookService.addBook(new Book(5, "《LOVE OVER FEAR》", "NATIONAL GEOGRAPHIC"));
        UserService userService = applicationContext.getBean("userService", UserService.class);
        Scanner scanner = new Scanner(System.in);
        boolean sign = true;
        while (sign) {
            printMenu();
            System.out.println("输入要进行的操作");
            int i = scanner.nextInt();
            switch (i) {
                case 1:
                    userService.userBorrowBook();
                    break;
                case 2:
                    userService.userReturn();
                    break;
                case 3:
                    userService.userGetBook();
                    break;
                case 4:
                    sign = false;
                    break;
                default:
                    System.out.println("错误选项，重新输入");
                    break;
            }
        }
        System.out.println("系统退出");
    }

    public static void printMenu() {
        System.out.println("********************");
        System.out.println("*\t\t1.借阅书籍\t\t*");
        System.out.println("*\t\t2.归还书籍\t\t*");
        System.out.println("*\t\t3.查询现有书籍\t\t*");
        System.out.println("*\t\t4.退出\t\t*");
        System.out.println("********************");
    }
}
