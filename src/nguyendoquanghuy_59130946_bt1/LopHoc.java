/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nguyendoquanghuy_59130946_bt1;

/**
 *
 * @author HP
 */
import java.util.ArrayList;

public class LopHoc {
    ArrayList<HocSinh> danhSachHocSinh = new ArrayList<HocSinh>();
    GiaoVien giaoVienChuNhiem;
    ArrayList<GiaoVien> danhSachGiaoVien = new ArrayList<GiaoVien>();
    ArrayList<QLDS> qldsGiaoVien = new ArrayList<QLDS>();
    QLDS qldsHocSinh;
    
    public void themHocSinh(HocSinh hs){        
        danhSachHocSinh.add(hs);
    }
    
    public  void themGiaoVien(GiaoVien gv){
        danhSachGiaoVien.add(gv);
    }
    
    public void inDSHS(){
        int k = 1;
        for(HocSinh i:danhSachHocSinh){
            System.out.println("Hoc Sinh thu "+k);      
            System.out.println(i.hienThiTT());
            k++;
            System.out.println();
        }
    }
    
    public  void inDSGVGD(){
        int k = 1;
        for(GiaoVien i:danhSachGiaoVien){
            System.out.println("Giao Vien thu "+k);
            System.out.println(i.hienThiTT());
            k++;
            System.out.println();
        }
    }
}
