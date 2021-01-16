import java.lang.annotation.*;
import java.lang.reflect.*;

public class AutowiringUsingReflection {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        AutowiringUsingReflection aur = new AutowiringUsingReflection();

        Constructor<?> mainComponentConstructor = MainComponent.class.getConstructor();
        MainComponent mainComponent = (MainComponent) mainComponentConstructor.newInstance();
        Field[] allFields = MainComponent.class.getDeclaredFields();
        for (Field field : allFields) {
            if (field.getAnnotation(Autowired.class) != null) {
                Class<?> fieldClass = field.getType();
                Constructor<?> fieldClassConstructor = fieldClass.getConstructor();
                field.set(mainComponent, field.getType().cast(fieldClassConstructor.newInstance()));                
            }
        }

        mainComponent.callDependency();
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface Component {
}

@Retention(RetentionPolicy.RUNTIME)
@interface Autowired {
}

@Component
public class Dependency {
    public void hello() {
        System.out.println("Hello!");
    }
}

@Component
public class MainComponent {
    @Autowired
    public Dependency dependency;

    public void callDependency() {
        dependency.hello();
    }

    public Dependency getDependency() {
        return dependency;
    }

    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
    }
}
