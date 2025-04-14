public class Vehicle {
    private String ten, loai;
    private int dt;
    private double gia;
    public Vehicle(String t, String l, int d, double g) {
        ten = t; loai = l; dt = d; gia = g;
    }
    double thue() {
        if (dt < 100) return gia * 0.01;
        else if (dt <= 200) return gia * 0.03;
        else return gia * 0.05;
    }
    void in() {
        System.out.printf("%-20s %-15s %8d %15.2f %15.2f\n", ten, loai, dt, gia, thue());
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle v1 = nhap(sc), v2 = nhap(sc), v3 = nhap(sc);
        System.out.printf("%-20s %-15s %8s %15s %15s\n", "Ten chu xe", "Loai xe", "Dung tich","Tri gia", "Thue phai nop");
        v1.in(); v2.in(); v3.in();
    }
    static Vehicle nhap(Scanner sc) {
        System.out.print("Ten chu xe: "); String t = sc.nextLine();
        System.out.print("Loai xe: "); String l = sc.nextLine();
        System.out.print("Dung tich: "); int d = sc.nextInt();
        System.out.print("Tri gia: "); double g = sc.nextDouble(); sc.nextLine();
        return new Vehicle(t, l, d, g);
    }
}

