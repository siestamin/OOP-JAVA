package QuanLiSanPham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap ten san pham: ");
        String name = scanner.nextLine();
        System.out.println("Moi nhap id san pham: ");
        String id = scanner.nextLine();
        System.out.println("Moi nhap loai san pham: ");
        String loai = scanner.nextLine();
        System.out.println("Moi nhap gia san pham:  ");
        String gia = scanner.nextLine();
        System.out.println("Moi nhap ngay nhap san pham: ");
        String ngayNhap = scanner.nextLine();
        System.out.println("Moi nhap so luong mua: ");
        int soLuongMua = Integer.parseInt(scanner.nextLine());
        System.out.println("Moi nhap so luong san pham: ");
        int soLuong = Integer.parseInt(scanner.nextLine());
       Product sp = new Product(name,id,loai,gia,ngayNhap,soLuong,soLuongMua);
       sp.chonMua(soLuong);
       sp.checkStatus();
       sp.inThongTin();
       
    }
}
