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
public class HoaDonSP implements Serializable{
    private int ma, maSP, maHD,sl;
    private MatHang matHang;
    private HoaDon hoaDon;

    public HoaDonSP() {
    
    }

    public HoaDonSP(int ma,  int sl,MatHang matHang,int maHD) {
        this.ma = ma;
        this.sl = sl;
        this.matHang = matHang;
        this.maHD = maHD;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public int getSl() {
        return sl;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    

   
  
    public Object[] toObjects(){
        return new Object[]{
            ma, sl, matHang.getSl(), maHD,
        };
    }
}
