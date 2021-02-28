public class DynamicClassLoading {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class<?> alhamdulillahClass = Class.forName("Alhamdulillah");
        Alhamdulillah alhamdulillah = (Alhamdulillah) alhamdulillahClass.newInstance();
        alhamdulillah.alhamdulillah();
    }
}
