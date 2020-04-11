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
public class NguyenDoQuangHuy_59130946_BT1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HocSinh hs1 = new HocSinh("Nguyen Van A", 22, "2/4 ha phuoc", "099921122", "59cntt3", "Bong Ban");
        HocSinh hs2 = new HocSinh("Nguyen Thi B", 21, "1 Nguyen Dinh Chieu", "091232222", "58Maket", "Danh Dan");
        HocSinh hs3 = new HocSinh("Pham Thi C", 18, "32 Cao Ba Quat", "0912322", "61cntt3", "Ve");
        HocSinh hs4 = new HocSinh("Do Van D", 23, "33 Tran Binh Trong", "093219823", "57cntt2", "Ban Sung");
        HocSinh hs5 = new HocSinh("Huynh Tat E", 20, "1 Thang Long", "091238237", "61cntt3", "Chay Nhanh");
        
        GiaoVien gv1 = new GiaoVien("Cao My F", 30, "2 Cao Ba Quat", "01231232", "Dai So Tuyen Tinh", "Toan");
        GiaoVien gv2 = new GiaoVien("Phuong Tra G", 29, "30 Yearsin", "09123212", "Nhap Mon Lap Trinh", "CNTT");
        GiaoVien gv3 = new GiaoVien("Pham Van H", 34, "31  Yearsin", "09238172", "OOP", "CNTT");
        
        
        LopHoc lh = new LopHoc();
        
        lh.themHocSinh(hs1);
        lh.themHocSinh(hs2);
        lh.themHocSinh(hs3);
        lh.themHocSinh(hs4);
        lh.themHocSinh(hs5);
        
        lh.themGiaoVien(gv1);
        lh.themGiaoVien(gv2);
        lh.themGiaoVien(gv3);
        
        System.out.println("Danh Sach Hoc Sinh\n");
        lh.inDSHS();
        
        System.out.println("Danh Sach Giao Vien\n");
        lh.inDSGVGD();
        //Testing
        
                
    }
    
}
