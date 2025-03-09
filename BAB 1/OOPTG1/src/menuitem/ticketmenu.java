/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuitem;

/**
 *
 * @author WINDOWS 11
 */
public class ticketmenu {
    String nama_bus;
    int harga;
    public ticketmenu(String nama, double harga) {
    this.nama_bus = nama;
    this.harga = (int) harga;
    }  
    public void tampilinfo(){
        System.out.println("Nama BUS : " + nama_bus);
        System.out.println("Harga Tiket    : Rp " + harga);
        System.out.println("----------------------------");
    }
}
