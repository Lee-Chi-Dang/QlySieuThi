/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class HoaDon implements Serializable{
    private int ma, maNV, maKH;
    private String ngayTao;
    private String ghiChu;
    

    public HoaDon() {
        
    }

    public HoaDon(int ma,  int maNV,int maKH,String ngayTao, String ghiChu) {
        this.ma = ma;
        this.maNV = maNV;
        this.maKH = maKH;
        this.ngayTao = ngayTao;
        this.ghiChu = ghiChu;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

   
    

    public Object[] toObjects(){
        return new Object[]{
            ma, maNV, maKH, ngayTao, ghiChu
        };
    }
}
