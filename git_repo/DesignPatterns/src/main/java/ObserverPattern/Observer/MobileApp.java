package ObserverPattern.Observer;

public class MobileApp implements Observer{
    String name;

    public MobileApp(String name){
        this.name = name;
    }
    public void update(float temp){
        System.out.println("MobileApp " +name+ " :temperature updated to :" + temp);
    }
}
