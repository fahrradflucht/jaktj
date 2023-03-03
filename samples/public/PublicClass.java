import com.example.thingdoer.ThingDoer;

public class PublicClass implements ThingDoer {
    private int times;

    public PublicClass(int times) {
        this.times = times;
    }

    public void doThing() {
        for (int i = 0; i < times; i++) {
            System.out.println("Doing a thing!");
        }
    }
}