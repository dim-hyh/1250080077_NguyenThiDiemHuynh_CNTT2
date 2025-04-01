import java.util.Scanner;
public class Bai02  {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print ("Nhập chiều rộng:");
        double chieurong = scanner.nextDouble();
        System.out.print ("Nhập chiều dài:");
        double chieudai = scanner.nextDouble();
        double dientich = chieurong * chieudai;
        System.out.println("Diện tích hình chữ nhật là:" + dientich);
        scanner.close();
    }

    
}
