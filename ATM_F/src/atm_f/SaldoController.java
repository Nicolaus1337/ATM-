/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_f;

/**
 *
 * @author Nico
 */
public class SaldoController {
    private Uang model;
    private saldoView view;
    
    public SaldoController(Uang model, saldoView view) {
        this.model = model;
        this.view = view; 
    }
    
    public void setSaldoNew(int saldo){
        model.setSaldo(saldo);
    }
    
    public long getSaldoNew(){
        return model.getSaldo();
    } 
    
    public void updateView(){
        view.printSaldoSekarang(model.getSaldo());
    }
}
