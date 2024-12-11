public class Main {
    public static void main(String[] args) {
//        Employee employee = new Employee("Giorgi", "Gablishvili", 32, "34242325");
//        System.out.println("employee ID: " + employee.getEmployeeID());
//        System.out.println("employee Age: " + employee.getAge());
//
//        Manager manager = new Manager("Nikoloz", "Arabiani", 45, "2134123");
//        System.out.println("manager ID: " + manager.getManagerID());


//        figures.Circle circle = new figures.Circle(5);
//        System.out.println("წრის ფართობი: " + circle.getArea());
//        System.out.println("წრის პერიმეტრი: " + circle.getPerimeter());
//
//        figures.Rectangle rectangle = new figures.Rectangle(4, 3);
//        System.out.println("მართკუთხედის ფართობი: " + rectangle.getArea());
//        System.out.println("მართკუთხედის პერიმეტრი: " + rectangle.getPerimeter());
//        System.out.println("მართკუთხედის დიაგონალი: " + rectangle.getDiagonal());
//
//        figures.Triangle triangle = new figures.Triangle(3, 4, 5);
//        System.out.println("სამკუთხედის ფართობი: " + triangle.getArea());
//        System.out.println("სამკუთხედის პერიმეტრი: " + triangle.getPerimeter());


        Shop.Shop shop = new Shop.Shop(3);

        Shop.Milk milk1 = new Shop.Milk(1.99, "2024-12-31", 1.0);
        Shop.Cake cake1 = new Shop.Cake(10.99, "2024-12-20", 0.5);
        Shop.Sandwich sandwich1 = new Shop.Sandwich(5.49, "2024-12-15", 6.0);
        shop.addProduct(milk1);
        shop.addProduct(cake1);
        shop.addProduct(sandwich1);

        Shop.Milk m = (Shop.Milk) shop.getProducts()[0];
        System.out.println("Shop.Milk: Price = " + m.getPrice() + ", Expiration = " + m.getExpiration() + ", Volume = " + m.getVolume() + "L");

        Shop.Cake c = (Shop.Cake) shop.getProducts()[1];
        System.out.println("Shop.Cake: Price = " + c.getPrice() + ", Expiration = " + c.getExpiration() +", Weight = " + c.getWeight() + "kg");

        Shop.Sandwich s = (Shop.Sandwich) shop.getProducts()[2];
        System.out.println("Shop.Sandwich: Price = " + s.getPrice() + ", Expiration = " + s.getExpiration() + ", Length = " + s.getLength() + "cm");

    }
}

