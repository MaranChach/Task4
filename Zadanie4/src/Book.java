public class Book implements IPrintable {
    @Override
    public void print() {
        System.out.println("Вывод книги");
    }

    public static void printBooks(IPrintable[] printable){
        for (int i = 0; i < printable.length; i++){
            if (printable[i] instanceof Book){
                printable[i].print();
            }
        }
    }
}
