package src.Homework;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class homework16 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Book("红楼梦",100,"曹雪芹"));
        list.add(new Book("西游记",99.9,"吴承恩"));
        list.add(new Book("水浒传",91,"施耐庵"));

        Book.sort(list);
        System.out.println(list);
            }
}

class Book{
    public String Book;
    public double Price;
    public String Writer;

    public Book(String book, double price, String writer) {
        Book = book;
        Price = price;
        Writer = writer;
    }

    public final static void sort(List list){
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                Book book1 = (Book)list.get(i);
                Book book2 = (Book)list.get(j);
                if(book1.Price > book2.Price){
                    list.set(i,book2);
                    list.set(j,book1);
                }
            }
        }
    }

    public String getBook() {
        return Book;
    }

    public void setBook(String book) {
        Book = book;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getWriter() {
        return Writer;
    }

    public void setWriter(String writer) {
        Writer = writer;
    }

    @Override
    public String toString() {
        return "名称：" + Book
                + "\t" + "价格：" +
                Price + "\t" + "作者：" +
                Writer + "\t";
    }
}