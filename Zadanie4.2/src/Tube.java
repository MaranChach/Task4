public class Tube implements IInstrument{
    float diameter;

    public Tube(float diameter_){
        diameter = diameter_;
    }

    @Override
    public void play() {
        System.out.println("Играет труба с диаметром " + diameter);
    }
}
