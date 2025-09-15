package OOP_Nguoi3;

import java.util.*;
import java.text.*;

public class GiaoVien extends Nguoi {

    private String maGiaoVien;
    private String xepLoaiThiDua;

    public GiaoVien() {
        super();
    }

    public GiaoVien(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd, String maGiaoVien) {
        super(hoVaTen, ngaySinh, gioiTinh, cmnd);
        this.maGiaoVien = maGiaoVien;
    }

    public String getMaGiaoVien() {
        return maGiaoVien;
    }

    public void setMaGiaoVien(String maGiaoVien) {
        this.maGiaoVien = maGiaoVien;
    }

    public String getXepLoaiThiDua() {
        return xepLoaiThiDua;
    }

    public void setXepLoaiThiDua(String xepLoaiThiDua) {
        this.xepLoaiThiDua = xepLoaiThiDua;
    }

    @Override
    public void nhapThongTin(Scanner sc, SimpleDateFormat sdf) {
        super.nhapThongTin(sc, sdf);
        sc.nextLine();
        System.out.print("Nhap ma giao vien: ");
        this.maGiaoVien = sc.nextLine();
        xepLoaiThiDua(sc);
    }

    public void xepLoaiThiDua(Scanner sc) {
        System.out.println("Xep loai thi dua (1-Loai A, 2-Loai B, 3-Loai C): ");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 ->
                xepLoaiThiDua = "Loai A";
            case 2 ->
                xepLoaiThiDua = "Loai B";
            case 3 ->
                xepLoaiThiDua = "Loai C";
            default ->
                xepLoaiThiDua = "Khong xac dinh";
        }
    }

    @Override
    public void capNhatNguoiBangCmnd(int cmnd, Scanner sc, SimpleDateFormat sdf) {
        if (getCmnd() == cmnd) {
            System.out.println("Nhap lai thong tin Giao Vien co CMND " + cmnd);
            nhapThongTin(sc, sdf);
        }
    }

    @Override
    public void xuatThongTin(SimpleDateFormat sdf) {
        super.xuatThongTin(sdf);
        System.out.println("Ma giao vien: " + maGiaoVien);
        System.out.println("Xep loai thi dua: " + xepLoaiThiDua);
    }

    @Override
    public void traTienDoXe() {
        System.out.println("Giao vien: mien phi");
    }
}
