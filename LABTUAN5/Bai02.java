import java.util.Scanner;
interface CoTheVe {
    void ve();
}
abstract class HinhHoc {
    public abstract double tinhDienTich();
    public abstract double tinhChuVi();
}
class HinhChuNhat extends HinhHoc implements CoTheVe {
    private double chieuDai;
    private double chieuRong;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        chieuRong = sc.nextDouble();
    }
    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    @Override
    public double tinhChuVi() {
        return 2 * (chieuDai + chieuRong);
    }
    @Override
    public void ve() {
        System.out.println("Vẽ hình chữ nhật");
    }
    public void xuat() {
        System.out.println("Hình chữ nhật:");
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}
class HinhVuong extends HinhHoc implements CoTheVe {
    private double canh;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh hình vuông: ");
        canh = sc.nextDouble();
    }
    @Override
    public double tinhDienTich() {
        return canh * canh;
    }
    @Override
    public double tinhChuVi() {
        return 4 * canh;
    }
    @Override
    public void ve() {
        System.out.println("Vẽ hình vuông");
    }
    public void xuat() {
        System.out.println("Hình vuông:");
        System.out.println("Diện tích: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }
}
public class Bai02 {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        System.out.println("Nhập hình chữ nhật:");
        hcn.nhap();
        hcn.xuat();
        hcn.ve();
        System.out.println();
        HinhVuong hv = new HinhVuong();
        System.out.println("Nhập hình vuông:");
        hv.nhap();
        hv.xuat();
        hv.ve();
    }
}
