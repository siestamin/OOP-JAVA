package GiaoVien;

public class GiaoVien {
    private String name;
    private int age;
    private String phone;
    private String email;
    private String subject;
    private String className;
    private String level;
    private String sex;

    public GiaoVien(String name, int age, String phone, String email,String subject, String className, String level,String sex) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.email= email;
        this.subject = subject;
        this.className = className;
        this.level = level;
        this.sex = sex;
    } public boolean isRetired () {
        if (age >= 60) {
            return true;
        } else {
            return false;
        }
    }
    public void printSalary () {
        if(level.equals("A")) {
            System.out.println("Luong cua giao vien " + name + " la 10000000000000$");
        } else if (level.equals("B")) {
            System.out.println("Luong cua giao vien " + name + " la 700000000000000$");
        } else if (level.equals("C")) {
            System.out.println("Luong cua giao vien " + name + " la 5000000000000$");
    } else {
        System.out.println("BAC KHONG HOP LE!!!!");
    }
} 
public void inThongTin () {
    System.out.println("Ten : " + name);
    System.out.println("Tuoi: " + age);
    System.out.println("SDT :" + phone);
    System.out.println("Email: " + email);
    System.out.println("Mon Hoc : " + subject);
    System.out.println("Ten Lop : " + className);
    System.out.println("Bac cua giao vien: " + level);
    System.out.println("Gioi Tinh: " + sex);
}
  
}
