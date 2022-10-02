/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atm_f;

import java.util.Scanner;

/**
 *
 * @author Nico
 */
public class ATM_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int saldo = 500000;
       
       Uang model = retrieveUangFromDatabase();
       saldoView view = new saldoView();      
       SaldoController controller = new SaldoController(model, view);
       
       while(true) {
            Scanner scanner = new Scanner(System.in);
            MenuFactory menuFactory = new MenuFactory();
            Menu menu1 = menuFactory.getMenu("MENU");
            menu1.menu_u();
            
           
            int pilih = scanner.nextInt();
            
            if(pilih == 1){
                
                CekSaldoSingle saldo_1 = CekSaldoSingle.getInstance();
                saldo_1.showSaldo();
                controller.setSaldoNew(saldo);
                controller.updateView();
                
                ulang();
            } 
            else if (pilih == 2) {             
               
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                          ATM                        |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|Masukan Nominal uang yang ditarik :                  |");
                int nominal = scanner.nextInt();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println();
                
                if(saldo - nominal < 100000 ) {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|                          ATM                        |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|nominal penarikan melebihi batas minimal sisa saldo  |");
                    System.out.println("|Silahkan ulangi transaksi                            |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();
                    
                    
                }
                
                else {
                    if(nominal%50000 == 0) {


                    saldo = saldo - nominal;
                    controller.setSaldoNew(saldo);
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|                          ATM                        |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|Saldo sekarang adalah :                              |" );
                    controller.updateView();
                    
                    ulang();
                    }

                    else {
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|                          ATM                        |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("|Nominal bukan kelipatan Rp50.000                     |");
                    System.out.println("|Silahkan ulangi transaksi                            |");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();
                    
                    
                    }
                }
                
            }
            else if (pilih == 3) {
                
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                          ATM                        |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|Silahkan masukan nominal setor :                     |");
                int nominal = scanner.nextInt();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println();

       
                if(nominal % 50000 == 0){
                saldo = saldo + nominal;
                controller.setSaldoNew(saldo);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                          ATM                        |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|saldo sekarang adalah :                              |");
                controller.updateView();
                
                ulang();
                }
        
                else {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                          ATM                        |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|nominal bukan kelipatan Rp50.000                     |");
                System.out.println("|Silahkan ulangi transaksi                            |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                
                }
            }
            
            else if (pilih == 4) {
               
                
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                     Terima kasih                    |");
                System.out.println("|                       Sayonara.                     |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                
                break;
            }
            
            else {
                
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                          ATM                        |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|Inputan salah !                                      |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println();
                
                ulang();
            }
       }
        
       
        
    }
    public static void ulang(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|                          ATM                        |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("|Ingin Melanjutkan transaksi :                        |");
        System.out.println("|1.Yes                                                |");
        System.out.println("|2.No                                                 |");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        int coba = userInput.nextInt();
        
        if (coba<=1)
        {
      
        }
        else{
           
                
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("|                     Terima kasih                    |");
                System.out.println("|                       Sayonara.                     |");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
               
                System.exit(0);
        }
    }
    
    public static Uang retrieveUangFromDatabase(){
        Uang uang = new Uang();
        uang.setSaldo(0);
        return uang;
    }
}
