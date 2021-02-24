public class Overriding {
    public static void main(String[] args) {
        Overriding overriding = new Overriding();

        //Child c = new Parent();        
        Parent p = new Child();
        System.out.println(p.i);
    }
}

class Parent {
    public int i = 10;

    public void show() {
        System.out.println("This is parent");
    }
}

class Child extends Parent {
    public int i = 15;

    @Override
    public void show() {
        System.out.println("This is child");
    }
}
