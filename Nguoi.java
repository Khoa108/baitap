package OOP_Nguoi3;

import java.util.*;
import java.text.*;

public abstract class Nguoi {

    private String hoVaTen;
    private Date ngaySinh;
    private String gioiTinh;
    private int cmnd;

    public Nguoi() {
    }

    public Nguoi(String hoVaTen, Date ngaySinh, String gioiTinh, int cmnd) {
        this.hoVaTen = hoVaTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.cmnd = cmnd;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getCmnd() {
        return cmnd;
    }

    public void setCmnd(int cmnd) {
        this.cmnd = cmnd;
    }

    public void nhapThongTin(Scanner sc, SimpleDateFormat sdf) {
        try {
            sc.nextLine();
            System.out.print("Nhap ho va ten: ");
            this.hoVaTen = sc.nextLine();

            System.out.print("Nhap ngay sinh (dd/MM/yyyy): ");
            this.ngaySinh = sdf.parse(sc.nextLine());

            System.out.print("Nhap gioi tinh: ");
            this.gioiTinh = sc.nextLine();

            System.out.print("Nhap CMND: ");
            this.cmnd = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Loi khi nhap thong tin: " + e.getMessage());
        }
    }

    public void xuatThongTin(SimpleDateFormat sdf) {
        System.out.println("Ho va ten: " + hoVaTen);
        System.out.println("Ngay sinh: " + sdf.format(ngaySinh));
        System.out.println("Gioi tinh: " + gioiTinh);
        System.out.println("CMND: " + cmnd);
    }

    public void capNhatNguoiBangCmnd(int cmnd, Scanner sc, SimpleDateFormat sdf) {
        if (this.cmnd == cmnd) {
            System.out.println("Nhap lai thong tin moi cho nguoi co CMND: " + cmnd);
            nhapThongTin(sc, sdf);
        }
    }

    public abstract void traTienDoXe();
}
