public class SuperExample {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.display();
        System.out.println(car.maxSpeed);        
    }
}

class Vehicle {
    int maxSpeed = 120;

    public void display() {
        System.out.println("Max Speed is: " + maxSpeed);
    }
}

class Car extends Vehicle {
    int maxSpeed = 180;

    public void display() {
        System.out.println("Max Speed is: " + maxSpeed);
    }
}
