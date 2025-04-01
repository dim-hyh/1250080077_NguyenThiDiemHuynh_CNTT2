import java.utill.Scanner;
public class buoi1b3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ F: ");
        double F = scanner.nextDouble();
        double C = (F - 32) / 1.8;
        System.out.println("Nhiệt độ C: " + C);
        scanner.close();
    }
}
