package Teacher;



import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Phone number: ");
        String phoneNumber = scanner.next();

        System.out.print("Email: ");
        String email = scanner.next();

        System.out.print("Subject: ");
        String subject = scanner.next();

        System.out.print("Class name: ");
        String className = scanner.next();

        System.out.print("Level: ");
        int level = scanner.nextInt();

        Teacher teacher = new Teacher(name, age, phoneNumber, email, subject, className, level);
        teacher.printInfo();
        teacher.printSalary();
       if ( teacher.isRetired()) {
         System.out.println("GIAO VIEN DA NGHI HUU");
       } else {
        System.out.println("CHUA NGHI HUU");
       }
    }
}


