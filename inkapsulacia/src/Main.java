public class Main {
    public static void main(String[] args) {

        Person lekso = new Person( "Lekso", 16, "0135454321");
//        System.out.println(lekso.name);
//        System.out.println(lekso.age);

//        System.out.println(lekso.getName());
//        System.out.println(lekso.getAge());
//        lekso.setAge(17);
//        lekso.setName("Lekso 2");
//        System.out.println(lekso.getAge());
//        System.out.println(lekso.getName());

        lekso.setAge(-19);
        System.out.println(lekso.getAge());

        System.out.println(lekso.limbs);
        System.out.println(Person.limbs);
        System.out.println(Person.getSpecies());
    }
}