public class Magazine implements IPrintable{
    @Override
    public void print() {
        System.out.println("Вывод журнала");
    }

    public static void printMagazines(IPrintable[] printable){
            for (int i = 0; i < printable.length; i++){
                if (printable[i] instanceof Magazine){
                    printable[i].print();
                }
            }
        }
}

