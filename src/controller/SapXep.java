/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Comparator;
import java.util.List;
import model.KhachHang;

/**
 *
 * @author Admin
 */
public class SapXep {
    public <T> void sxbyTen(List<T> list){
        list.sort(new Comparator<T>(){
            @Override
            public int compare(T o1, T o2) {
                if(o1 instanceof KhachHang){
                    KhachHang k1=(KhachHang) o1;
                    KhachHang k2=(KhachHang) o2;
                    String name1=k1.getTen().trim();
                    String name2=k1.getTen().trim();
                    String ten1=name1.substring(name1.lastIndexOf(" "));
                    String ten2=name2.substring(name2.lastIndexOf(" "));
                    return ten1.compareTo(ten2);
                }
                return 0;
            }
            
        });
    }
    public <T> void sxbyMa(List<T> list){
        list.sort(new Comparator<T>(){
            @Override
            public int compare(T o1, T o2) {
                if(o1 instanceof KhachHang){
                    KhachHang k1=(KhachHang) o1;
                    KhachHang k2=(KhachHang) o2;
                    return (k1.getMa()+"").compareTo((k2.getMa()+""));
                }
                return 0;
            }
            
        });
    }
}
