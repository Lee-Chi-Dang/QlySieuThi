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
public class ChiNhanh implements Serializable{
    private int ma;
    private String tenCN, diaChi;

    public ChiNhanh(){
       
    }

    public ChiNhanh(int ma, String tenCN,  String diaChi) {
        this.ma = ma;
        this.tenCN = tenCN;
        this.diaChi = diaChi;
    }


    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenCN() {
        return tenCN;
    }

    public void setTenCN(String tenCN) {
        this.tenCN = tenCN;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Object[] toObjects(){
        return new Object[]{
            ma, tenCN, diaChi
        };
    }
}
