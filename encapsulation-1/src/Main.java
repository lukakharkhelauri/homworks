public class Main {
    public static void main(String[] args) {

        Student[] students = new Student[5];

        students[0] = new Student("Vato", "Tabatadze", 20, 3, 25.5);
        students[1] = new Student("Demetre", "Demetrashvili", 19, 2, 56.3);
        students[2] = new Student("Cotne", "Maisuradze", 21, 4, 75.0);
        students[3] = new Student("Kato", "Akhvlediani", 18, 1, 89.0);
        students[4] = new Student("Kesiaria", "Abuladze", 22, 5, 95.7);

        Student topStudent = students[0];

        for (int i = 1; i < students.length; i++) {
            if (students[i].getAveragePoints() > topStudent.getAveragePoints()) {
                topStudent = students[i];
            }
        }

        System.out.println("Top student: " + topStudent.getFirstName() + " " + topStudent.getLastName() +
                " with average points: " + topStudent.getAveragePoints());


        Weather tbilisiForecast = new Weather("Tbilisi", 15.0, 10.0, false, false, true);
        tbilisiForecast.printForecast();
        System.out.println("Recommendation for a walk in Tbilisi: " +
                (tbilisiForecast.recommendForWalk() ? "Yes" : "No"));
    }
}