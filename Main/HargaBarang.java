/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Bayu_Ramadhan
 */
public class HargaBarang {
    private String namaBarang;
    private int harga;
    
    public HargaBarang(String namaB, int harga)
    {
        this.namaBarang = namaB;
        this.harga = harga;
    }
    
    public String getNama()
    {
        return this.namaBarang;
    }
    
    public int getHarga()
    {
        return this.harga;
    }
}
