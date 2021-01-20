import java.lang.reflect.*;
import java.lang.annotation.*;

public class MultipleAnnotations {
    public static void main(String[] args) throws NoSuchMethodException {
        MultipleAnnotations ma = new MultipleAnnotations();

        Annotation[] annotations = Meta2.class.getAnnotations();
        for (Annotation annotation : annotations)
            System.out.println(annotation);

        Annotation[] methodAnnotations = Meta2.class.getMethod("myMethod").getAnnotations();
        for (Annotation annotation : methodAnnotations)
            System.out.println(annotation);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@MyAnno(str = "Meta2 annotation", val = 100)
@What(description = "This is a class annotation")
public class Meta2 {
    @MyAnno(str = "myMethod annotation", val = 20)
    @What(description = "This is a method annotation")
    public void myMethod() {
        System.out.println("MyMethod");
    }
}
