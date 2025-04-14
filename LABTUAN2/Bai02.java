import java.util.Scanner;
public class Bai02 {
    private double dai;
    private double rong;
    public HinhChuNhat(double d, double r) {
        dai = d;
        rong = r;
 }
    public double getDai() {
        return dai;
 }
    public double getRong() {
        return rong;
}
    public void setDai(double d) {
        dai = d;
}
    public void setRong(double r) {
        rong = r;
 }
    public double dienTich() {
        return dai * rong;
}
    public double chuVi() {
        return 2 * (dai + rong);
 }
    public String toString() {
        return "Dai: " + dai + ", Rong: " + rong +", Dien tich: " + dienTich() + ", Chu vi: " + chuVi();
 }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double d = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double r = sc.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat(d, r);
        System.out.println(hcn);
        sc.close();
    }
}
