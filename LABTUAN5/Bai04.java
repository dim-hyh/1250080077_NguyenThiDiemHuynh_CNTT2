import java.util.Scanner;
abstract class Dia {
    protected String maDia;
    protected String tenDia;
    protected double giaBan;
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã đĩa: ");
        maDia = sc.nextLine();
        System.out.print("Nhập tên đĩa: ");
        tenDia = sc.nextLine();
        System.out.print("Nhập giá bán: ");
        giaBan = sc.nextDouble();
        sc.nextLine(); // bỏ dòng trống
    }

    public void xuat() {
        System.out.println("Mã đĩa: " + maDia);
        System.out.println("Tên đĩa: " + tenDia);
        System.out.println("Giá bán: " + giaBan);
    }

    public abstract String loaiDia();
}
class DiaNhac extends Dia {
    private String caSi;
    private String theLoai;
    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên ca sĩ: ");
        caSi = sc.nextLine();
        System.out.print("Nhập thể loại nhạc: ");
        theLoai = sc.nextLine();
    }

    @Override
    public void xuat() {
        System.out.println("--- Đĩa nhạc ---");
        super.xuat();
        System.out.println("Ca sĩ: " + caSi);
        System.out.println("Thể loại nhạc: " + theLoai);
    }

    @Override
    public String loaiDia() {
        return "Nhạc";
    }
}

class DiaPhim extends Dia {
    private String daoDien;
    private String theLoai;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên đạo diễn: ");
        daoDien = sc.nextLine();
        System.out.print("Nhập thể loại phim: ");
        theLoai = sc.nextLine();
    }
    @Override
    public void xuat() {
        System.out.println("--- Đĩa phim ---");
        super.xuat();
        System.out.println("Đạo diễn: " + daoDien);
        System.out.println("Thể loại phim: " + theLoai);
    }

    @Override
    public String loaiDia() {
        return "Phim";
    }
}
public class Bai04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dia[] danhSach = new Dia[100];
        int n;

        System.out.print("Nhập số lượng đĩa: ");
        n = sc.nextInt();
        sc.nextLine(); // bỏ dòng trống
        for (int i = 0; i < n; i++) {
            System.out.println("Chọn loại đĩa [1-Nhạc | 2-Phim]: ");
            int loai = sc.nextInt();
            sc.nextLine(); // bỏ dòng trống
            if (loai == 1) {
                danhSach[i] = new DiaNhac();
            } else {
                danhSach[i] = new DiaPhim();
            }
            System.out.println("Nhập thông tin đĩa thứ " + (i + 1));
            danhSach[i].nhap();
        }
        System.out.println("\n=== Danh sách đĩa ===");
        for (int i = 0; i < n; i++) {
            danhSach[i].xuat();
            System.out.println();
        }
    }
}
