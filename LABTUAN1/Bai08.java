import java.util.Scanner;

public class Bai08 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        System.out.print("Nhập số: ");
        int so = SC.nextInt();

        int CSCuoi = layCsCuoi(so);
        int CSDau = layCsDau(so);

        System.out.println("Chữ số đầu: " + CSDau);
        System.out.println("Chữ số cuối: " + CSCuoi);

        sc.close();
    }

    static int layCsCuoi(int so) {
        return so % 10;
    }

    static int layCsDau(int so) {
        while (so >= 10) {
            so /= 10;
        }
        return so;
    }
}
