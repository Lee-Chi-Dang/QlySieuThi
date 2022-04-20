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
public class NhanVien implements Serializable{
    private int ma, maCN;
    private String ten, tenDN;
    private String chucVu;
    private String matKhau;

    public NhanVien() {

    }

    public NhanVien(int ma, String ten,String chucVu, int maCN, String tenDN, String matKhau) {
        this.ma = ma;
        this.ten = ten;
        this.chucVu = chucVu;
        this.maCN = maCN;
        this.tenDN = tenDN;
        this.matKhau = matKhau;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maCN) {
        this.maCN = maCN;
    }

    public String getTenDN() {
        return tenDN;
    }

    public void setTenDN(String tenDN) {
        this.tenDN = tenDN;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
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
    
    public Object[] toObjects(){
        return new Object[]{
            ma, ten, chucVu, maCN, tenDN, matKhau
        };
    }
}
