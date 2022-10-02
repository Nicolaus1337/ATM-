/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atm_f;

/**
 *
 * @author Nico
 */
public class MenuFactory {
    public Menu getMenu(String MenuType) {
        if ( MenuType == null)
            return null;
        
        if ( MenuType.equalsIgnoreCase("MENU")) {
            return new MenuUtama();
        }
    
        
        return null;
    }
}
