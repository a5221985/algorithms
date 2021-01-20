import java.lang.annotation.*;
import java.lang.reflect.*;

public class SingleValueAnno {
    public static void main(String[] args) {
        Annotation annotation = MyClass.class.getAnnotation(MyAnno.class);
        System.out.println(annotation);       

        Annotation annotation2 = MySecondClass.class.getAnnotation(MyAnno.class);
        System.out.println(annotation2);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    int value();
    String description() default "Default description";
}

@MyAnno(100)
public class MyClass {
}

@MyAnno(value = 120, description = "My second class")
public class MySecondClass {
}
