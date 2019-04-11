package com.book;

public class Book {
    private int id;
    private String name;
    private double price;
    private String author;

    public Book() {
        this.id=2019;
        this.name = "神雕侠侣";
        this.price =2019.22;
        this.author ="金庸";
    }

    public Book(int id, String name, double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void printBookInfo() {

        System.out.println("My BookId is:" + this.id + ",My BookName is:" + this.name + ",My BookPrice is" + this.price + ",My BookAuthor is:" + this.author);
    }
    private int getNameLength() {

        return name.length();
    }
}
