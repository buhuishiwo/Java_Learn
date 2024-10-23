package com.haishili.spring6.bean;

public class User {
    private Integer id;
    private String name;
    private String url;
    private Integer alexa;
    private String country;

    public User() {
    }

    public User(Integer id, String name, String url, Integer alexa, String country) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.alexa = alexa;
        this.country = country;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", realName='" + name + '\'' +
                ", url='" + url + '\'' +
                ", alexa=" + alexa +
                ", country='" + country + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRealName() {
        return name;
    }

    public void setRealName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getAlexa() {
        return alexa;
    }

    public void setAlexa(Integer alexa) {
        this.alexa = alexa;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
