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
public class Kho implements Serializable{
    private int ma, maCN;
    private String tenKho;

    public Kho() {
  
    }

    public Kho(int ma, String tenKho,  int maCN) {
        this.ma = ma;
        this.tenKho = tenKho;
        this.maCN = maCN;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMaCN() {
        return maCN;
    }

    public void setMaCN(int maK) {
        this.maCN = maCN;
    }

    public String getTenKho() {
        return tenKho;
    }

    public void setTenKho(String tenKho) {
        this.tenKho = tenKho;
    }


    public Object[] toObjects(){
        return new Object[]{
            ma, tenKho, maCN
        };
    }
}
