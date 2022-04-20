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
public class SPKho implements Serializable{
    private int ma, maSP, maK,sl;

    public SPKho() {
    
    }

    public SPKho(int ma,  int sl,int maSP,int maK) {
        this.ma = ma;
        this.sl = sl;
        this.maSP = maSP;
        this.maK = maK;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public int getMaK() {
        return maK;
    }

    public void setMaK(int maK) {
        this.maK = maK;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    

    

   
  
    public Object[] toObjects(){
        return new Object[]{
            ma, sl, maK, maSP,
        };
    }
}
