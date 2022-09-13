public class Main {
    public static void main(String[] args) {
        IPrintable[] printable = {new Book(), new Magazine()};
        Book.printBooks(printable);
    }
}