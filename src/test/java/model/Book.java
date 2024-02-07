package model;

public class Book {
    public String title;
    public String author;
    public double price;
    public int howManySold;
    public boolean AuthorFunny;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHowManySold() {
        return howManySold;
    }

    public void setHowManySold(int howManySold) {
        this.howManySold = howManySold;
    }

    public boolean isAuthorFunny() {
        return AuthorFunny;
    }

    public void setAuthorFunny(boolean authorFunny) {
        AuthorFunny = authorFunny;
    }
}
