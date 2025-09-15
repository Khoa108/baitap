package OOP_Nguoi3;

import java.util.*;
import java.text.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DanhSachNguoi ds = new DanhSachNguoi();

        int tiepTuc = 1;
        while (tiepTuc == 1) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Sua danh sach");
            System.out.println("3. Xoa danh sach");
            System.out.println("4. Xuat danh sach");
            System.out.print("Lua chon: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1 -> {
                    System.out.print("Nhap doi tuong (1-Sinh Vien, 2-Giao Vien): ");
                    int opt = sc.nextInt();
                    sc.nextLine();
                    if (opt == 1) ds.themDanhSach(new SinhVien(), sc, sdf);
                    else if (opt == 2) ds.themDanhSach(new GiaoVien(), sc, sdf);
                    else System.out.println("Lua chon khong hop le!");
                }
                case 2 -> {
                    System.out.print("Nhap CMND can sua: ");
                    int cmnd = sc.nextInt();
                    sc.nextLine(); 
                    ds.capNhatDanhSachBangCmnd(cmnd, sc, sdf);
                }
                case 3 -> {
                    System.out.print("Nhap CMND can xoa: ");
                    int cmnd = sc.nextInt();
                    sc.nextLine();
                    ds.xoaDanhSachBangCmnd(cmnd);
                }
                case 4 -> ds.xuatDanhSach(sdf);
                default -> System.out.println("Lua chon khong hop le!");
            }

            System.out.print("Tiep tuc khong? (1-co, 0-khong): ");
            tiepTuc = sc.nextInt();
            sc.nextLine(); 
        }

        sc.close();
    }
}
