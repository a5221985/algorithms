public class StaticNestedClassSingleton {
    private StaticNestedClassSingleton() {}

    private static class SingletonHolder {
        static final StaticNestedClassSingleton instance = new StaticNestedClassSingleton();
    }

    static StaticNestedClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public static void main(String[] args) {
        System.out.println(StaticNestedClassSingleton.getInstance());
    }
}
