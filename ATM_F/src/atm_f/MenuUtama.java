/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_f;

/**
 *
 * @author Nico
 */
public class MenuUtama implements Menu{

    @Override
    public void menu_u() {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|               Menu              |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Tarik Tunai");
        System.out.println("3. Setor Tunai");
        System.out.println("4. Keluar");
        System.out.println();
        System.out.println("Pilih menu : ");
    }
    
}
