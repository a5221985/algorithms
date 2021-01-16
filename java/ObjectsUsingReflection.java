import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectsUsingReflection {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class<?> simpleClass = Class.forName("Simple");
        Constructor<?> constructor = simpleClass.getConstructor();
        Simple simple = (Simple) constructor.newInstance();
        simple.hello();
    }
}

public class Simple {
    public void hello() {
        System.out.println("Hello");
    }
}
