/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuitem;

/**
 *
 * @author lasmanaadit
 */
public class katalogmenu {
    public static void main(String[] args){
        ticketmenu menu1 = new ticketmenu("Bus Hafana", 30000);
        ticketmenu menu2 = new ticketmenu("Bus Bagong", 25000);
        ticketmenu menu3 = new ticketmenu("Bus Restu Panda", 50000);
        
        System.out.println("===== KATALOG Tiket =====");
        menu1.tampilinfo();
        menu2.tampilinfo();
        menu3.tampilinfo();
    }        
}
