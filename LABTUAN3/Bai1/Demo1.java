public class Demo1 {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();  
        hs1.setMaSo("HS01");
        hs1.setHoTen("Nguyen Van A");
        hs1.setDiemTrungBinh(8.5);
        HocSinh hs2 = new HocSinh();  
        hs2.nhapHocSinh();
        HocSinh hs3 = new HocSinh("HS03", "Tran Thi C", 9.2); 
        System.out.println("== Thông tin học sinh ==");
        hs1.xuatHocSinh();
        hs2.xuatHocSinh();
        hs3.xuatHocSinh();
    }
}
