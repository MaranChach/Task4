public class Drums implements IInstrument{
    float size;

    public Drums(float size_){
        size = size_;
    }

    @Override
    public void play() {
        System.out.println("Играет барабан с размером " + size);
    }
}
