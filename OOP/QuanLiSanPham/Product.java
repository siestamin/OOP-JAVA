package QuanLiSanPham;
/* java oop BTVN : quản lí sản phẩm;
  Viết sản phẩm : id,tên,loại,giá,ngày nhập bán,số lượng .
phương thức in ra thông tin;
Phương thức check còn hàng hay không , status còn hàng k còn hàng;
in ra thông tin.
hàm: chọn mua
nếu hết hàng thì báo k còn hàng và in ra số lượng còn lại. */
public class Product {
      private String name;
      private String id;
      private String loai;
      private String price;
      private String ngayNhap;
      private int soLuong;

      public Product(String name, String id, String loai, String gia,String ngayNhap, int soLuong, int soLuongMua) {
        this.name = name;
        this.id = id;
        this.loai= loai;
        this.price = gia;
        this.ngayNhap = ngayNhap;
        this.soLuong = soLuong;   
}  public String checkStatus () {
         if ( soLuong > 0) {
            return "Con hang";
         } else {
            return"Het hang";
         }
}  public void chonMua(int soLuongMua) {
    if (soLuong >= soLuongMua) {
        soLuong -= soLuongMua;
        System.out.println("Mua thành công " + soLuongMua + " sản phẩm " + name);
    } else {
        System.out.println("Không đủ số lượng sản phẩm " + name + " để mua.");
        System.out.println("Số lượng sản phẩm còn lại: " + soLuong);
    }
}
public void inThongTin() {
    System.out.println("Ten san pham: " + name);
    System.out.println("ID : " + id);
    System.out.println("Loai san pham: " + loai);
    System.out.println("Price : " + price);
    System.out.println("Ngay nhap ban: " + ngayNhap);
    System.out.println("So Luong : " + soLuong);
}

}