public class EnumExample {
    public static void main(String[] args) {
        Apple ap = Apple.Jonathan;
        System.out.println(ap);
        System.out.println(ap == Apple.Jonathan);

        switch (ap) {
            case Jonathan:
                System.out.println("It is Jonathan");
                break;
            case GoldenDel:
                System.out.println("It is Golden Del");
                break;
            case RedDel: 
                System.out.println("It is Red Del");
                break;
            case Winesap:
                System.out.println("It is Winesap");
                break;
            case Contland:
                System.out.println("It is Cortland");
                break;
        }

        System.out.println(Apple.valueOf("GoldenDel"));

        for (Apple value : Apple.values()) {
            System.out.println(value + ": " + value.getPrice() + ": " + value.ordinal());
        }

        System.out.println(Apple.Contland + ": " + Apple.Contland.getPrice());

        Apple.Contland.setPrice(19);

        System.out.println(Apple.Contland + ": " + Apple.Contland.getPrice());

        Apple ap1, ap2, ap3;
        ap1 = Apple.Jonathan;
        ap2 = Apple.RedDel;
        ap3 = Apple.Jonathan;

        System.out.println(ap1.equals(ap2));
        System.out.println(ap1.compareTo(ap2));
        System.out.println(ap1.equals(ap3));
        System.out.println(ap1 == ap3);
    }
}

enum Apple {
    Jonathan(20), GoldenDel(15), RedDel(5), Winesap(30), Contland(17);
    int price;

    Apple(int price) {
        this.price = price;
    }

    Apple() {
        price = -1;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }
}
