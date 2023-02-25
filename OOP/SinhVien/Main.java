package SinhVien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap ten:");
        String name = scanner.nextLine();
        System.out.println("Moi nhap tuoi");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap email: ");
        String email = scanner.nextLine();
        System.out.println("Diem Toan: ");
        double diemToan = Double.parseDouble(scanner.nextLine());
        System.out.println("Diem Ly: ");
        double diemLy = Double.parseDouble(scanner.nextLine());
        System.out.println("Diem Hoa :");
        double diemHoa = Double.parseDouble(scanner.nextLine());
         System.out.println();
        Students sv = new Students(name, age, email, diemToan, diemLy, diemHoa);
        sv.inThongTin();
        sv.xepLoai();
       
    }
}
