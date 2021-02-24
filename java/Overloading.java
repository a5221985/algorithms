public class Overloading {
    public void show(String str) {
        if (str == null)
            throw new RuntimeException("input cannot be null");
        System.out.println(str);
    }

    public void show(Integer i) {
        if (i == null)
            throw new RuntimeException("input cannot be null");
        System.out.println(i);
    }

    public static void main(String[] args) {
        Overloading overloading = new Overloading();

        overloading.show(null);        
    }
}
