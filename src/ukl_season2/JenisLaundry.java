/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ukl_season2;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class JenisLaundry {
    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasihari = new ArrayList<Integer>();
    
    public int size(){
        return this.jenisLaundry.size();
    }
    
    public JenisLaundry(){
        this.jenisLaundry.add("Cuci Kering");
        this.harga.add(10000);
        this.durasihari.add(1);
        
        this.jenisLaundry.add("Cuci Lipat");
        this.harga.add(12000);
        this.durasihari.add(2);
        
        this.jenisLaundry.add("Cuci Setrika");
        this.harga.add(15000);
        this.durasihari.add(2);
	
	this.jenisLaundry.add("Sepatu");
	this.harga.add(20000);
	this.durasihari.add(3);
	
	this.jenisLaundry.add("Cuci Helm");
        this.harga.add(30000);
        this.durasihari.add(4);
        
        this.jenisLaundry.add("Cuci Karpet");
        this.harga.add(50000);
        this.durasihari.add(5);
    }
    
    public void setLaundry(String jenis){
        this.jenisLaundry.add(jenis);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public void setDurasi(int durasi){
        this.durasihari.add(durasi);
    }
    public String getLaundry(int id){
        return this.jenisLaundry.get(id);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
    public int getDurasi(int id){
        return this.durasihari.get(id);
    }
    
}