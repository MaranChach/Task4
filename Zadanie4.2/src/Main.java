public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(6);
        guitar.play();

        Drums drums = new Drums(30.6f);
        drums.play();

        Tube tube = new Tube(10);
        tube.play();
    }
}