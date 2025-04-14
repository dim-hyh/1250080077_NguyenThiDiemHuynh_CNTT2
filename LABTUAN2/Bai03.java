import java.util.Scanner;
public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemLT;
    private float diemTH;
    public SinhVien() {
        maSV = 0;
        hoTen = "";
        diemLT = 0;
        diemTH = 0;
 }
    public SinhVien(int m, String h, float lt, float th) {
        maSV = m;
        hoTen = h;
        diemLT = lt;
        diemTH = th;
}
    public void setMaSV(int m) {
        maSV = m;
    }
    public void setHoTen(String h) {
        hoTen = h;
}
    public void setDiemLT(float lt) {
        diemLT = lt;
 }
    public void setDiemTH(float th) {
        diemTH = th;
     }
    public float tinhDTB() {
        return (diemLT + diemTH) / 2;
}
    public void xuat() {
        System.out.printf("%-6d %-20s %6.2f %8.2f %8.2f\n",maSV, hoTen, diemLT, diemTH, tinhDTB());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinhVien sv1 = new SinhVien(11111, "Nguyen Thanh An", 6.5f, 8.5f);
        SinhVien sv2 = new SinhVien(22222, "Le Thi Bong", 7.5f, 8.0f);
        SinhVien sv3 = new SinhVien();
        System.out.print("Nhap ma so cua sinh vien sv3: ");
        sv3.setMaSV(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhap ho va ten cua sinh vien sv3: ");
        sv3.setHoTen(sc.nextLine());
        System.out.print("Nhap diem ly thuyet cua sinh vien sv3: ");
        sv3.setDiemLT(sc.nextFloat());
        System.out.print("Nhap diem thuc hanh cua sinh vien sv3: ");
        sv3.setDiemTH(sc.nextFloat());
        System.out.printf("%-6s %-20s %6s %8s %8s\n","masv", "hoten", "diemlt", "diemth", "diemtb");
        sv1.xuat();
        sv2.xuat();
        sv3.xuat();
        sc.close();
    }
}

    

