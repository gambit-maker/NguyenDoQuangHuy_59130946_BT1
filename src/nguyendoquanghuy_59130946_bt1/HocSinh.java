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
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;
    
    public HocSinh(String hoTen, int tuoi, String diaChi, String soDT,String lop, String nangKhieu){
        setHoTen(hoTen);
        setTuoi(tuoi);
        setDiaChi(diaChi);
        setSoDT(soDT);        
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }
    @Override
    public String hienThiTT() {
        return String.format("HoTen %s\n"
                + "Tuoi %d\n"
                + "DiaChi %s\n"
                + "SDT %s\n"
                + "Lop %s\n"
                + "NangKhieu %s",getHoten(),getTuoi(),getDiaChi(),getSoDT(),lop,nangKhieu);
    }
    
}
