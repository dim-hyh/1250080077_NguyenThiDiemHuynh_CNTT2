import java.util.Scanner;
abstract class NhanVien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected String trinhDo;
    protected double luongCoBan;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã nhân viên: ");
        maNhanVien = sc.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        tenNhanVien = sc.nextLine();
        System.out.print("Nhập trình độ: ");
        trinhDo = sc.nextLine();
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = sc.nextDouble();
        sc.nextLine(); // bỏ qua dòng trống
    }
    public void xuat() {
        System.out.println("Mã NV: " + maNhanVien);
        System.out.println("Tên NV: " + tenNhanVien);
        System.out.println("Trình độ: " + trinhDo);
        System.out.println("Lương cơ bản: " + luongCoBan);
    }
    public abstract double tinhLuong();
}
// Lớp QuanLy
class QuanLy extends NhanVien {
    private String chuyenMon;
    private double phuCapChucVu;
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuyên môn: ");
        chuyenMon = sc.nextLine();
        System.out.print("Nhập phụ cấp chức vụ: ");
        phuCapChucVu = sc.nextDouble();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyên môn: " + chuyenMon);
        System.out.println("Phụ cấp chức vụ: " + phuCapChucVu);
        System.out.println("Tổng lương: " + tinhLuong());
    }
    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapChucVu;
    }
}
// Lớp NghienCuu
class NghienCuu extends NhanVien {
    private String chuyenMon;
    private double phuCapDocHai;
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuyên môn: ");
        chuyenMon = sc.nextLine();
        System.out.print("Nhập phụ cấp độc hại: ");
        phuCapDocHai = sc.nextDouble();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Chuyên môn: " + chuyenMon);
        System.out.println("Phụ cấp độc hại: " + phuCapDocHai);
        System.out.println("Tổng lương: " + tinhLuong());
    }
    @Override
    public double tinhLuong() {
        return luongCoBan + phuCapDocHai;
    }
}
// Lớp PhucVu
class PhucVu extends NhanVien {
    @Override
    public double tinhLuong() {
        return luongCoBan;
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tổng lương: " + tinhLuong());
    }
}
// Lớp chính để kiểm tra
public class Bai01 {
    public static void main(String[] args) {
        System.out.println("1. Nhân viên Quản lý:");
        QuanLy ql = new QuanLy();
        ql.nhap();
        ql.xuat();
        System.out.println("\n2. Nhân viên Nghiên cứu:");
        NghienCuu nc = new NghienCuu();
        nc.nhap();
        nc.xuat();
        System.out.println("\n3. Nhân viên Phục vụ:");
        PhucVu pv = new PhucVu();
        pv.nhap();
        pv.xuat();
    }
}
