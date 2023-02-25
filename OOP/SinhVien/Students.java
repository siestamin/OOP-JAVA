package SinhVien;

public class Students {
    private String ten;
    private int age;
    private String email;
    private double diemToan;
    private double diemLy;
    private double diemHoa;
    private double diemTrungBinh;

    public Students ( String ten, int age, String email, double diemToan, double diemLy, double diemHoa) { 
        this.ten = ten;
        this.age = age;
        this.email = email;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTrungBinh = (diemToan + diemLy + diemHoa) / 3;
        
}  public void xepLoai() {
    if (diemTrungBinh >=8) {
        System.out.println("GIOI");
    } else if ( diemTrungBinh>=6.5 && diemTrungBinh <8) {
        System.out.println("KHA");
    } else if ( diemTrungBinh >=5 && diemTrungBinh < 6.5) {
        System.out.println("Sinh vien " + ten + " xep loai TRUNG BINH" );
    } else {
        System.out.println("YEU");
    }
}  public void inThongTin () {
    System.out.println("Ten: " + ten);
    System.out.println("Tuoi: " + age);
    System.out.println("Email: " + email);
    System.out.println("Diem Toan: " + diemToan);
    System.out.println("Diem Ly: " + diemLy);
    System.out.println("Diem Hoa:" + diemHoa);
    System.out.println("DTB : " + diemTrungBinh);
    
}

}
