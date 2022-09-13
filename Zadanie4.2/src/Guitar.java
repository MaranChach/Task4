public class Guitar implements IInstrument{
    int stringsNumber;

    public Guitar(int stringsNumber_){
        stringsNumber = stringsNumber_;
    }

    @Override
    public void play() {
        System.out.println("Играет гитара с " + stringsNumber + " струнами");
    }
}
