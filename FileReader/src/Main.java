import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try (PrintWriter pw = new PrintWriter("file.txt")) {
            pw.println("შიგან ასრე გავერივე, გნოლის ჯოგსა ვითა ქორი.");
            pw.println("კაცი კაცსა შემოვსტყორცნი, ცხენ-კაცისა დავდგი გორი.");
            pw.println("კაცი, ჩემგან განატყორცი ბრუნავს ვითა ტანაჯორი.");
            pw.println("ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        double sentenceCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                sentenceCount += line.split("\\s+").length + 0.25; // ვიცი რომ უკეთესი ვარიანტებიც არის მაგარ არ მაფიქრდება
            }
            System.out.println("Number of sentences: " + sentenceCount);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word to search: ");
        String word = scanner.nextLine();

        if (containsWord("file.txt", word)) {
            System.out.println("Word is in file");
        } else {
            System.out.println("Word is not in the file");
        }

        try (PrintWriter pw = new PrintWriter("capital.txt")) {
            pw.println("Assure polite his real and other figures though. Day age advantages");
            pw.println("and sufficient eating expression traveling. Of on am father by agreed");
            pw.println("supply rather either. Own handsome delicate property mistresses her");
            pw.println("end appetite. Mean are sons too sold nor said. Son share three men");
            pw.println("power by you. Now merits wonder effect garret own.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader("capital.txt"));
             PrintWriter pw = new PrintWriter("capital_upper.txt")) {
            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (PrintWriter pw = new PrintWriter("concatfile1.txt")) {
            pw.println("How to eat khinkali \uD83E\uDDC4");
            pw.println("First you need to bite it and drink soup.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try (PrintWriter pw = new PrintWriter("concatfile2.txt")) {
            pw.println("How to eat khinkali PT2 \uD83E\uDDC4");
            pw.println("And then eat it. \uD83D\uDE0B");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        PrintWriter pw = new PrintWriter("concatfilefinal.txt");

        BufferedReader br = new BufferedReader(new FileReader("concatfile1.txt"));

        String line = br.readLine();


        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }
        br.close();

        pw.println();

        br = new BufferedReader(new FileReader("concatfile2.txt"));
        line = br.readLine();

        while (line != null) {
            pw.println(line);
            line = br.readLine();
        }
        br.close();
        pw.close();

        System.out.println("Look for concatfilefinal to learn how to eat khinkali \uD83C\uDDEC\uD83C\uDDEA");

    }

    public static boolean containsWord(String fileName, String word) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(word)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
