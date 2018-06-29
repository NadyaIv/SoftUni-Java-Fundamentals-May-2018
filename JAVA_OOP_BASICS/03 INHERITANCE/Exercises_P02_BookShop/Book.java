package Exercises_P02_BookShop;

import java.text.DecimalFormat;

public class Book {
    //title, author and price
    private String title;
    private String author;
    private double price;

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public Book(String author, String title, double price) {
       this.setAuthor(author);
        this.setTitle(title);
       this.setPrice(price);
    }

    protected void setAuthor(String author) {
        String[] names=author.split("\\s+");
        if(names.length==2){
            if(Character.isDigit(names[1].charAt(0))){
                throw new IllegalArgumentException("Author not valid!");
            }
        }

        this.author = author;
    }

    protected void setTitle(String title) {
        if(title.length()<3){
            throw new IllegalArgumentException("Title not valid!");
        }
        this.title = title;
    }

    protected void setPrice(double price) {
        if(price<=0){
            throw new IllegalArgumentException("Price not valid!");
        }
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Type: ").append(this.getClass().getSimpleName())
                .append(System.lineSeparator())
                .append("Title: ").append(this.getTitle())
                .append(System.lineSeparator())
                .append("Author: ").append(this.getAuthor())
                .append(System.lineSeparator())
                .append("Price: ").append(String.format("%.1f",this.getPrice()))
                .append(System.lineSeparator());
        return sb.toString();

    }
}
