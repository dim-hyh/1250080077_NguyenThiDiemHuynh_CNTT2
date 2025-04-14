import java.util.Arrays;
import java.util.Scanner;

public class Bai01 {
   // a.Nhập mảng một chiều các số nguyên:
    public static int[] nhapMang(Scanner scanner){
    System.out.print("Nhập số phần tử của mảng :");
    int n = scanner.nextInt();
    int[] mang = new int[n];
    for (int i = 0; i < n; i++){
        System.out.print("Nhập phần tử thứ" + i + ":");
        mang[i] = scanner.nextInt();
    }
       return mang;
   }
}


// b.Xuất các phần tử mảng ra cửa sổ xuất chẳn:
 public static void xuatMang(int[] mang){
    System.out.print("Các phần tử trong mảng :");
    for (int i = 0,i < mang.length; i++){
        System.out.println("mang[" + i + "] = " + mang[i]);
        }
    }


    // c.Tìm vị trí của một số nguyên x trong mảng:
    public static void timViTriX(int[] a, int x) {
        boolean thay = false;
        for (int i = 0; i < a.length; i++) {
        if (a[i] == x) {
                System.out.print(i + " ");
                thay = true;
            }
        }
        if (!thay) {
            System.out.println("Khong tim thay " + x + " trong mang.");
        } else {
            System.out.println();
        }
    }
    

    // d.Tìm giá trị lớn nhất trong mảng:
    public static int timMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
         if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
   

 // e.Tìm giá trị nhỏ nhất trong mảng:
 public static int timMin(int[] a) {
    int min = a[0];
    for (int i = 1; i < a.length; i++) {
    if (a[i] < min) {
            min = a[i];
        }
    }
    return min;
}


// f.Tìm vị trí phần tử có giá trị lớn nhất trong mảng:
public static void viTriMax(int[] a, int max) {
    System.out.print("Vi tri co gia tri lon nhat (" + max + "): ");
    for (int i = 0; i < a.length; i++) {
    if (a[i] == max) {
      System.out.print(i + " ");
        }
    }
    System.out.println();
}


// g.Sắp xếp mảng tăng dần:
public static void sapXepTang(int[] a) {
    Arrays.sort(a);
    System.out.println("Mang sau khi sap xep tang dan:");
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i] + " ");
    }
    System.out.println();
}

// main
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mang = nhapMang(sc);
        xuatMang(mang);
        System.out.print("Nhap gia tri x can tim: ");
        int x = sc.nextInt();
        timViTriX(mang, x);
        int max = timMax(mang);
        int min = timMin(mang);
        System.out.println("Gia tri lon nhat: " + max);
        System.out.println("Gia tri nho nhat: " + min);
        viTriMax(mang, max);
        sapXepTang(mang);
        sc.close();
    }
}

