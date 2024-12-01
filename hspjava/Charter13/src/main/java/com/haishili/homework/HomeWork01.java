package com.haishili.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HomeWork01 {
    public static void main(String[] args) {
        News new1 = new News("新冠确诊病例超千万,数百万印度教信徒赴恒河“圣浴”引民众担忧");
        News new2 = new News("男子突然想起2个月前钓的鱼还在网兜里,捞起一看赶紧放生");

        ArrayList<News> newsList = new ArrayList<News>();
        newsList.add(new1);
        newsList.add(new2);
        Collections.sort(newsList, new Comparator<News>() {
            public int compare(News o1, News o2) {
                return o2.getTitle().compareTo(o1.getTitle());
            }
        });
        for (News news1 : newsList) {
            if(news1.getTitle().length()>15)
            {
                System.out.println(news1.getTitle().substring(0,15)+"...");
            }
        }
    }

}
class News {
    private String title;
    private String content;
    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "title='" + title ;
    }
}
