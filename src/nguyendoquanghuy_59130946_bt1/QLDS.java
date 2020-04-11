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
public class QLDS implements IQLDS{
    ArrayList<CaNhan> danhSach = new ArrayList<CaNhan>();            

    @Override
    public void themCaNhan(CaNhan x) {
        danhSach.add(x);
    }

    @Override
    public void xoa(CaNhan x) {
        danhSach.remove(x);
    }

    @Override
    public void inDS() {
        int k = 1;
        for(CaNhan i : danhSach){
            System.out.println("Ca Nhan Thu "+k);
            System.out.println(i.hienThiTT());
        }
    }
}
