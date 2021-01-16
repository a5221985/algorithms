import java.lang.annotation.Retention; // **(M)**
import java.lang.annotation.RetentionPolicy; // **(M)**
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationProcessor {
    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> myClass = MyClass.class;        
        MyAnno myAnno = myClass.getAnnotation(MyAnno.class);
        System.out.println("str: " + myAnno.str());
        System.out.println("val: " + myAnno.val());
   
        Method myMethod = myClass.getMethod("myMethod");
        MyAnno myMethodAnno = myMethod.getAnnotation(MyAnno.class);
        System.out.println("str: " + myMethodAnno.str());
        System.out.println("val: " + myMethodAnno.val());
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

@MyAnno(str = "This is an example of a custom annotation", val = 100)
public class MyClass {

    @MyAnno(str = "This is an exmaple of a method annotation", val = 20)
    public void myMethod() {
        System.out.println("My method");
    }    

}
