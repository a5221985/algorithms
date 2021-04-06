public record RecordExample (String name, String religion) {
    public static void main(String[] args) {
        RecordExample re = new RecordExample("Abdullah", "Islam");
        System.out.println(re);
        System.out.println(re.name());
        System.out.println(re.religion());
    }
}

/*
public class RecordExample {
    private final String name;
    private final String religion;

    RecordExample(String name, String religion) {
        this.name = name;
        this.religion = religion;
    }

    public String name() {
        return name;
    }

    public String reiligion() {
        return religion;
    }

    public boolean equals(Object o) {
        // equals logic
    }

    public int hashCode() {
        // hashcode logic
    }

    public String toString() {
        // toString logic
    }
}
*/
