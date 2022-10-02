/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_f;

/**
 *
 * @author Nico
 */
public class CekSaldoSingle {
    private static CekSaldoSingle instance = new CekSaldoSingle();
    
    private CekSaldoSingle() {}
    
    public static CekSaldoSingle getInstance() {
        return instance;
    }
    
    
    public void showSaldo() {
        System.out.println("Saldo sekarang adalah : ");
    }
}
