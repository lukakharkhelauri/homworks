public class Main {
    public static void main(String[] args) {
        Toy toy1 = new Toy("Car", 8);
        Toy toy2 = new Toy("Doll", 5);
        System.out.println(toy1);
        System.out.println(toy2);

        Reindeer reindeer1 = new Reindeer("Rudolph",  9, 23, "yellow");
        Reindeer reindeer2 = new Reindeer("Dasher",  11, 42, "red");
        reindeer1.fly();
        reindeer2.fly();
        System.out.println(reindeer1.checkFitnessLevel());
        System.out.println(reindeer2.checkFitnessLevel());

        Santa santa = new Santa("Santa Claus", 150);
        Child child1 = new Child("Alice", 8);
        Child child2 = new Child("Bob", 4);
        child1.addWish("Bike");
        child2.addWish("Train Set");
        santa.getChildrenList().add(child1);
        santa.getChildrenList().add(child2);
        System.out.println(santa.checkNaughtyOrNiceList());
        santa.deliverGifts();

        System.out.println(child1);
        System.out.println(child2);

        Elf elf1 = new Elf("Buddy", 120, 23, "Yellow");
        Elf elf2 = new Elf("Jingle", 95, 23, "Greem");
        System.out.println(elf1);
        System.out.println(elf2);
        elf1.performSkill();
        elf2.performSkill();

        Snowman snowman = new Snowman(1.8, "Blue");
        System.out.println(snowman);
        snowman.makeMagical();
        snowman.decorate("Scarf");
        snowman.decorate("Carrot Nose");
        snowman.melt();
        System.out.println(snowman);

    }
}