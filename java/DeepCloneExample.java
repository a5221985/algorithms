public class DeepCloneExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Test2 t1 = new Test2();
        t1.a = 100;
        t1.b = 200;
        t1.c.x = 10;
        t1.c.y = 30;
        
        System.out.println();
        System.out.println(t1);

        System.out.println();
        Test2 t2 = (Test2) t1.clone();
        System.out.println(t2); 

        t2.a = 300;
        t2.b = 500;
        t2.c.x = 67;
        t2.c.y = 97;
        
        System.out.println();
        System.out.println(t1);
        System.out.println();
        System.out.println(t2); 
    }
}

class Test implements Cloneable {
    int x, y;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}

class Test2 implements Cloneable {
    int a, b;
    Test c = new Test();

    @Override
    public Object clone() throws CloneNotSupportedException {
        Test2 t = (Test2) super.clone();
        t.c = (Test) t.c.clone();
        return t;
    }

    @Override
    public String toString() {
        return "a = " + a + "\nb = " + b + "\nc:\n\t" + c.toString();
    }
}
