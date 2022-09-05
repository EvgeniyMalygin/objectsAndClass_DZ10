public class Main {
    public static void main(String[] args) {
        Author authorFistBook = new Author("Александр", "Пушкин");
        Author authorSecondBook = new Author("Александр", "Грибоедов");
        Book fistBook = new Book("Сборник стихов", "1979", authorFistBook);
        Book secondBook = new Book("Горе от ума", "1823", authorSecondBook);
        System.out.println("Первая книга " + fistBook.toString());
        fistBook.setYearOfPublication("1980");
        System.out.println("Первая книга " + fistBook.toString());
        System.out.println("Вторая книга " + secondBook.toString());

    }
}
