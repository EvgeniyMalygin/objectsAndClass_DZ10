import java.util.Objects;

public class Book {
    private String nameBook;
    private String yearOfPublication;
    private Author author;

    public Book(String nameBook, String year, Author author) {
        this.nameBook = nameBook;
        this.yearOfPublication = year;
        this.author = author;
    }

    public String getNameBook() {

        return nameBook;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }

    public String getAuthor() {
        return author.getFistName() + " " + author.getLastName();
    }

    public void setYearOfPublication(String year) {
        this.yearOfPublication = year;
    }

    @Override
    public String toString() {
        return "Название: \"" + this.nameBook + "\" " + "автор: " + author.toString() + " год издания: " + this.yearOfPublication;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book book = (Book) other;
        return nameBook.equals(book.nameBook) && yearOfPublication.equals(book.yearOfPublication) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, yearOfPublication, author);
    }
}
