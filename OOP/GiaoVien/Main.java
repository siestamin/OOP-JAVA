package GiaoVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap ten giao vien: ");
        String ten = scanner.nextLine();
        System.out.println("Moi nhap tuoi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap SDT: ");
        String sdt = scanner.nextLine();
        System.out.println("Moi nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Moi nhap mon hoc: ");
        String subject= scanner.nextLine();
        System.out.println("Moi nhap ten lop: ");
        String className = scanner.nextLine();
        System.out.println("Moi nhap bac cua giao vien: ");
        String bac = scanner.nextLine();
        System.out.println("Moi nhap gioi tinh: ");
        String sex = scanner.nextLine();
        System.out.println();
        GiaoVien gv = new GiaoVien(ten, age, sdt, email, subject, className, bac,sex);
        gv.inThongTin();
        gv.printSalary();
        if (gv.isRetired()) { 
            System.out.println("Giao vien " + ten +  "da nghi huu!!");
        } else {
            System.out.println("Giao vien " + ten + " con dang di day!!");
        }

    }
    
}
