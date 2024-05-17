public class Rental {
    private String date;
    private Book book;
    private Person person;
    public Rental(String date, Book book, Person person) {
        this.date = date;
        this.book = book;
        this.person = person;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public Book getBook() {
        return book;
    }
}
