package Exercises_P02_BookShop;

public class GoldenEditionBook extends Book {
    public GoldenEditionBook(String author,String title,double price){
        super(author,title,price);
    }
    @Override
    protected void setPrice(double price) {
        super.setPrice(1.3*price);
    }
}
