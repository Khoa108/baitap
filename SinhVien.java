package OOP_Nguoi3;

import java.util.*;
import java.text.*;

public class SinhVien extends Nguoi {

    private String maSinhVien;
    private String renLuyen;

    public SinhVien() {
        super();
    }

    public SinhVien(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd, String maSinhVien) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maSinhVien = maSinhVien;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getRenLuyen() {
        return renLuyen;
    }

    public void setRenLuyen(String renLuyen) {
        this.renLuyen = renLuyen;
    }

    @Override
    public void nhapThongTin(Scanner sc, SimpleDateFormat sdf) {
        super.nhapThongTin(sc, sdf);
        sc.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        this.maSinhVien = sc.nextLine();
        danhGiaRenLuyen(sc);
    }

    public void danhGiaRenLuyen(Scanner sc) {
        System.out.println("Danh gia ren luyen (1-Gioi, 2-Kha, 3-Trung binh, 4-Yeu): ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 ->
                renLuyen = "Gioi";
            case 2 ->
                renLuyen = "Kha";
            case 3 ->
                renLuyen = "Trung binh";
            case 4 ->
                renLuyen = "Yeu";
            default ->
                renLuyen = "Khong xac dinh";
        }
    }

    @Override
    public void capNhatNguoiBangCmnd(int cmnd, Scanner sc, SimpleDateFormat sdf) {
        if (getCmnd() == cmnd) {
            System.out.println("Nhap lai thong tin Sinh Vien co CMND " + cmnd);
            nhapThongTin(sc, sdf);
        }
    }

    @Override
    public void xuatThongTin(SimpleDateFormat sdf) {
        super.xuatThongTin(sdf);
        System.out.println("Ma sinh vien: " + maSinhVien);
        System.out.println("Ren luyen: " + renLuyen);
    }

    @Override
    public void traTienDoXe() {
        System.out.println("Sinh vien: 2000d/luot");
    }
}
