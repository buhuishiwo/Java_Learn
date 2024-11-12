package com.haishili.arrary;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅",90);
        books[2] = new Book("青年文摘",5);
        books[3] = new Book("Java炒饭教材",400);

        //Comparator是个接口，要实现其中的 compare 方法
//        Arrays.sort(books,new Comparator (){
//
//            @Override
//            public int compare(Object o1, Object o2) {
//                Book b1 = (Book) o1;
//                Book b2 = (Book) o2;
//                //比较两个参数的书名长度
//                return b2.getTitle().length()-b1.getTitle().length();
//            }
//        });
        Arrays.sort(books,new Comparator() {
            public int compare(Object o1, Object o2) {
                //向下转型
                Book b1 = (Book) o1;
                Book b2 = (Book) o2;
                //比较两个参数的价格
                return b1.getPrice()-b2.getPrice();
            }
        });
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
}

class Book{
    private String title;
    private int price;
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
