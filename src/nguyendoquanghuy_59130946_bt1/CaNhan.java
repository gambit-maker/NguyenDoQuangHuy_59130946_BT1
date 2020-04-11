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
public abstract class CaNhan {
    private String hoTen;
    private int tuoi;
    private String diaChi;
    private String soDT;
    
    public String getHoten(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }
    
    public int getTuoi(){
        return tuoi;
    }
    public void setTuoi(int tuoi){
        this.tuoi=tuoi;
    }
    
    public String getDiaChi(){
        return diaChi;
    }
    public void setDiaChi(String diaChi){
        this.diaChi = diaChi;
    }
    
    public String getSoDT(){
        return soDT;
    }
    public void setSoDT(String soDT){
        this.soDT = soDT;
    }
    
    
    public abstract String hienThiTT();    
}
