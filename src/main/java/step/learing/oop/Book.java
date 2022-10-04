package step.learing.oop;


public class Book
        extends Literature
        implements Printable
{
    private String author ;
    private String title;

    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title ;
    }

    public Book setAuthor(String author)
    {
        this.author = author;
        return this;
    }

    public Book setTitle(String title) {
        super.setTitle(title);
        return this;
    }

    @Override
    public void print() {
        System.out.printf( "Book. Author: %s. Title: %s%n",
                this.author, super.getTitle() ) ;
    }
    @Override
    public String toString()
    {

        return getAuthor();
    }
}
