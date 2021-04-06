public record RecordExample (String name, String religion) {
    public static void main(String[] args) {
        RecordExample re = new RecordExample("Abdullah", "Islam");
        System.out.println(re);
        System.out.println(re.name());
        System.out.println(re.religion());
    }
}
