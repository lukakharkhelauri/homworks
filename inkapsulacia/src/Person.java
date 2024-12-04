public class Person {
    public static final int limbs = 4;
    private static final String species = "Humanoid";
    private String name;
    private int age;
    private final String id;


    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("უარყოფითი ასაკი არ არსებობს");
        } else {
            this.age = age;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId(String id) {
        return id;
    }

    public static String getSpecies() {
        return species;
    }
}
