package OOP_Nguoi3;

import java.util.*;
import java.text.*;

public class DanhSachNguoi {

    private ArrayList<Nguoi> danhSachNguoi = new ArrayList<>();

    public void themDanhSach(Nguoi nguoi, Scanner sc, SimpleDateFormat sdf) {
        nguoi.nhapThongTin(sc, sdf);
        danhSachNguoi.add(nguoi);
    }

    public void capNhatDanhSachBangCmnd(int cmnd, Scanner sc, SimpleDateFormat sdf) {
        for (Nguoi n : danhSachNguoi) {
            if (n.getCmnd() == cmnd) {
                n.capNhatNguoiBangCmnd(cmnd, sc, sdf);
                return;
            }
        }
        System.out.println("Khong tim thay nguoi co CMND: " + cmnd);
    }

    public void xoaDanhSachBangCmnd(int cmnd) {
        danhSachNguoi.removeIf(n -> n.getCmnd() == cmnd);
    }

    public void xuatDanhSach(SimpleDateFormat sdf) {
        if (danhSachNguoi.isEmpty()) {
            System.out.println("Danh sach rong");
            return;
        }
        for (Nguoi n : danhSachNguoi) {
            n.xuatThongTin(sdf);
            n.traTienDoXe();
            System.out.println("---------------------------");
        }
    }
}
