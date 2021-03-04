public class Honda4 extends Bike {
    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.run();
    }
}

public abstract class Bike {
    void run() {
        System.out.println("running safely");
    }
}

