package ObserverPattern.Observer;

public class LEDDisplay implements Observer {
    String name;

    public LEDDisplay(String name){
        this.name = name;
    }
    public void update(float temp){
        System.out.println("LEDDisplay " +name+ " :temperature updated to :" + temp);
    }
}
