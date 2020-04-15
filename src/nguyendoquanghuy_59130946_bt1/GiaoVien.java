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
public class GiaoVien extends CaNhan{
    
    private String monDay;
    private String toBoMon;
    
    public GiaoVien(String hoTen, int tuoi, String diaChi, String soDT,String monDay, String toBoMon){
        setHoTen(hoTen);
        setTuoi(tuoi);
        setDiaChi(diaChi);
        setSoDT(soDT);        
        this.monDay = monDay;
        this.toBoMon = toBoMon;
    }
    @Override
    public String hienThiTT() {
        return String.format("HoTen %s\n"
                + "Tuoi %d\n"
                + "DiaChi %s\n"
                + "SDT %s\n"
                + "MonDay %s\n"
                + "ToBoMon %s",getHoten(),getTuoi(),getDiaChi(),getSoDT(),monDay,toBoMon);
    }
    
}
