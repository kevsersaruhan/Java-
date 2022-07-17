package practice09;

public class Q04_Book {

    private String bookName;
    private String authorName;
    private int numOfPage;
    public static int numOfBooks;

    public Q04_Book (String name, String author, int page){
        bookName=name;
        authorName=author;
        numOfPage=page;
        numOfBooks++;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void getBookInfo(){
        System.out.println("Book name : "+getBookName()+"\nAuthor: "+getAuthorName()+"\nNumber of page: "+getNumOfPage());
    }
}
