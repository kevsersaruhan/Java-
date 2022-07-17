package practice09;

import java.util.ArrayList;
import java.util.List;

public class Q04 {
    /*
    Type a code to add books to library with its information, then create a method to show the information of the book
     */
    public static void main(String[] args) {
        List<Q04_Book> bookList = new ArrayList<>();
        Q04_Book book1 = new Q04_Book("Le petit prince","Tom Hanks",60);
        Q04_Book book2 = new Q04_Book("La belle au bois d'ormant","Kenan Dogulu",500);
        bookList.add(book1);
        bookList.add(book2);
        for(Q04_Book b : bookList){
            b.getBookInfo();
            System.out.println();
        }
        System.out.println("Number of book: "+Q04_Book.numOfBooks);
    }

}
