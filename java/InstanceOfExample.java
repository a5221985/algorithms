public class InstanceOfExample {
    public static void main(String[] args) {
        InstanceOfExample ioe = new Test();
        InstanceOfExample ioe1 = new InstanceOfExample();
        System.out.println(ioe instanceof Test);  
        System.out.println(ioe instanceof InstanceOfExample);  
        System.out.println(ioe1 instanceof InstanceOfExample);  
        System.out.println(ioe1 instanceof Test);  
    }
}

public class Test extends InstanceOfExample {
    
}
