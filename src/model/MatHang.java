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
public class MatHang implements Serializable{
    private int ma, sl;
    private String ten;
    private String nhomH;
    private String gia;


    public MatHang() {
 
    }

    public MatHang(int ma, String ten,String nhomH, String gia,int sl) {
        this.ma = ma;
        this.ten = ten;
        this.sl = sl;
        this.nhomH = nhomH;
        this.gia = gia;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getNhomH() {
        return nhomH;
    }

    public void setNhomH(String nhomH) {
        this.nhomH = nhomH;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    
    public Object[] toObjects(){
        return new Object[]{
            ma, ten, nhomH, gia, sl
        };
    }
}
