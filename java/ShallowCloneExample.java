public class ShallowCloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowCloneExample sce = new ShallowCloneExample();

        Test2 t1 = new Test2();
        t1.a = 100;
        t1.b = 200;
        t1.c.x = 10;
        t1.c.y = 30;

        System.out.println(t1);
        Test2 t2 = (Test2) t1.clone();
        t2.b = 500;
        t2.c.x = 50;
        t2.c.y = 60;

        System.out.println();
        System.out.println(t1);
        System.out.println();
        System.out.println(t2);
    }
}

class Test {
    int x, y;
}

class Test2 implements Cloneable {
    int a;
    int b;
    Test c = new Test();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "a = " + a + "\nb = " + b + "\nc:\n\t x = " + c.x + ", y = " + c.y;
    }
}
